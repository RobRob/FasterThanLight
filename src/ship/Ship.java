package ship;

import java.util.*;

import system.Weapons.InstalledWeapon;
import shipComponents.*;

public abstract class Ship {
	
	// INSTANCE VARIABLES
	
	protected int hull;
	protected int maxHull;
	
	protected Reactor reactor;
	protected int maxReactorCapacity = 25;
	
	protected ArrayList<crew.Crew> shipCrew = new ArrayList<crew.Crew>();
	protected int maxCrewSize = 8;
	
	protected Map<system.SystemEnum, system.System> installedSystems = new HashMap<system.SystemEnum, system.System>();
	
	protected augmentation.Augmentation[] installedAugmentations = new augmentation.Augmentation[3];
	
	protected String[][] shipRepresentation;
	protected String[][] divideRepresentation;
	
	protected Map<String, layout.Room> rooms = new HashMap<String, layout.Room>();
	protected Map<List<Integer>, layout.Square> squares = new HashMap<List<Integer>, layout.Square>();
	
	protected Inventory inventory;
	
	protected int maxWeapons;
	protected int maxDrones;
	
	protected double evasion;
	
	protected double oxygen;
	protected double oxygenCapacity = 100.0;
	protected double oxygenLoss = 1.2; // loss of oxygen per second
	
	// GET AND SET METHODS
	
	public int getHull() {return hull;}
	public int getMaxHull() {return maxHull;}
	
	public Inventory getInventory() {return inventory;}
	
	public Reactor getReactor() {return reactor;}
	
	public ArrayList<crew.Crew> getShipCrew() {return shipCrew;}
	public int getMaxCrewSize() {return maxCrewSize;}
	
	public Map<system.SystemEnum, system.System> getInstalledSystems() {return installedSystems;}
	public Map<String, layout.Room> getRooms() {return rooms;} 
	
	public augmentation.Augmentation[] getInstalledAugmentations() {return installedAugmentations;}
	
	public double getEvasion() {return evasion;}
	public int getOxygen() {return (int) oxygen;} // Returns as an int for display
	
	// OTHER METHODS
	
	public system.System getInstalledSystem(system.SystemEnum systemType) {
		if (installedSystems.containsKey(systemType)) {
			return installedSystems.get(systemType);
		}
		else {return null;}
	}
	
	public void updateEvasion() {
		int pilotingModifier = 1;
		double newEvasion = 0;
		system.System piloting = getInstalledSystem(system.SystemEnum.PILOTING);
		if (piloting.equals(null)) {evasion = 0.0; return;}
		else {
			 if (piloting.isManned()) {
				 pilotingModifier = 1;
				 newEvasion += piloting.getCrewLevel(system.SystemEnum.PILOTING);
			 }
			 else {
				 
			 }
		}
		system.System engines = getInstalledSystem(system.SystemEnum.ENGINES);
		if (!engines.equals(null)) {
			if (engines.isActive()) {
				//apply the evasion of the engines
				if (engines.isManned()) {
					evasion += engines.getCrewLevel(system.SystemEnum.ENGINES);
				}
			}
		}
		
		system.System cloaking = getInstalledSystem(system.SystemEnum.CLOAKING);
		if (!cloaking.equals(null)) {
			if (cloaking.isActive()) {
				newEvasion += 60;
			}
		}
		evasion = (newEvasion*pilotingModifier)/100;
	}
	
	public void updateOxygen(double time) {
		system.Oxygen oxygenSys = (system.Oxygen) getInstalledSystem(system.SystemEnum.OXYGEN);
		if (oxygenSys != null) {
			oxygen += oxygenSys.supplyOxygen(time);
		}
		oxygen -= oxygenLoss*time;
		if (oxygen > 100) {oxygen = 100;}
		if (oxygen < 0) {oxygen = 0;}
	}
	
	public void setUpRooms() {
		layout.Square newSquare = null;
		system.System systemForRoom = null;
		ArrayList<Integer> intList = new ArrayList<Integer>();
		int yCount = 0;
		int xCount;
		for (String[] yRow : shipRepresentation) {
			xCount = 0;
			for (String x : yRow) {
				if (!rooms.containsKey(x)) {
					switch (x) {
					case "--" : case "HU" : systemForRoom = null; break; 
													// Hull and -- are effectively the same, but something could be done in future
												   // R(n) is also a room code, but they all don't have systems in
					case "SH" : systemForRoom = getInstalledSystem(system.SystemEnum.SHIELDS); break;
					case "EN" : systemForRoom = getInstalledSystem(system.SystemEnum.ENGINES); break;
					case "OX" : systemForRoom = getInstalledSystem(system.SystemEnum.OXYGEN); break;
					case "WE" : systemForRoom = getInstalledSystem(system.SystemEnum.WEAPONS); break;
					case "ME" : systemForRoom = getInstalledSystem(system.SystemEnum.MEDBAY); break;
					case "CB" : systemForRoom = getInstalledSystem(system.SystemEnum.CLONEBAY); break; // CL needed for Cloaking
					case "DR" : systemForRoom = getInstalledSystem(system.SystemEnum.DRONES); break;
					case "HA" : systemForRoom = getInstalledSystem(system.SystemEnum.HACKING); break;
					case "MI" : systemForRoom = getInstalledSystem(system.SystemEnum.MIND_CONTROL); break;
					case "TE" : systemForRoom = getInstalledSystem(system.SystemEnum.TELEPORTER); break;
					case "CL" : systemForRoom = getInstalledSystem(system.SystemEnum.CLOAKING); break; 
					case "AR" : systemForRoom = getInstalledSystem(system.SystemEnum.ARTILLERY_BEAM); break;
					case "FL" : systemForRoom = getInstalledSystem(system.SystemEnum.FLAK_ARTILLERY); break;
					case "PI" : systemForRoom = getInstalledSystem(system.SystemEnum.PILOTING); break;
					case "SE" : systemForRoom = getInstalledSystem(system.SystemEnum.SENSORS); break;
					case "DO" : systemForRoom = getInstalledSystem(system.SystemEnum.DOORS); break;
					
					
					}
					rooms.put(x, new layout.Room(systemForRoom));
				}
				if (!x.equals("--")&&!x.equals("HU")) {
					intList = new ArrayList<Integer>();
					intList.add(xCount);
					intList.add(yCount);
					newSquare = new layout.Square(xCount, yCount);
					rooms.get(x).addSquare(newSquare);
					squares.put(intList, newSquare);
				}
				xCount++;
			}
			yCount++;
		}
	}
	
	public void setUpRoutePlan() {
		ArrayList<Integer> upNeighbour;
		ArrayList<Integer> rightNeighbour;
		ArrayList<Integer> downNeighbour;
		ArrayList<Integer> leftNeighbour;
		System.out.println(squares);
		for (Map.Entry<List<Integer>, layout.Square> s: squares.entrySet()) {
			
			upNeighbour = new ArrayList<Integer>();
			upNeighbour.add(s.getKey().get(0)); upNeighbour.add(s.getKey().get(1) - 1);
			
			rightNeighbour = new ArrayList<Integer>();
			rightNeighbour.add(s.getKey().get(0) + 1); rightNeighbour.add(s.getKey().get(1));
			
			downNeighbour = new ArrayList<Integer>();
			downNeighbour.add(s.getKey().get(0)); downNeighbour.add(s.getKey().get(1) + 1);
			
			leftNeighbour = new ArrayList<Integer>();
			leftNeighbour.add(s.getKey().get(0) - 1); leftNeighbour.add(s.getKey().get(1));
			
			if (squares.containsKey(upNeighbour)) {
				s.getValue().setRoute(squares.get(upNeighbour), squares.get(upNeighbour));
			}
			if (squares.containsKey(rightNeighbour)) {
				s.getValue().setRoute(squares.get(rightNeighbour), squares.get(rightNeighbour));
			}
			if (squares.containsKey(downNeighbour)) {
				s.getValue().setRoute(squares.get(downNeighbour), squares.get(downNeighbour));
			}
			if (squares.containsKey(leftNeighbour)) {
				s.getValue().setRoute(squares.get(leftNeighbour), squares.get(leftNeighbour));
			}
			System.out.println(s.getValue());
		}
	}
	
	public String generateReadout() {
		
		String rS = "";
		
		// general ship readout
		rS += "Hull Strength: " + getHull() + "/" + getMaxHull() + "\n";
		rS += "Power: " + reactor.getPower() + "\n";
		rS += "Power Capacity: " + reactor.getCapacity() + "\n";
		rS += "Fuel: " + inventory.getFuel() + "\n";
		rS += "Missiles: " + inventory.getMissiles() + "\n";
		rS += "Drone Parts: " + inventory.getDrones() + "\n";
		rS += "Evasion: " + getEvasion() + "\n";
		rS += "Oxygen: " + getOxygen() + "\n";
		
		for (crew.Crew c : shipCrew) {
			rS += "Crew Name: " + c.getName() + " Crew Race: " + c.getRace() + " " + c.getLocation()
					+ " Health: " + c.getCurrentHealth() + "/" + c.getMaxHealth() + "\n";
		}
		for (Map.Entry<system.SystemEnum, system.System> s: installedSystems.entrySet()) {
			rS += "System Name: " + s.getValue().getName() + " System Level: " + s.getValue().getSystemLevel() + 
					" System Capacity: " + s.getValue().getSystemCap() + " Manned?: " + s.getValue().isManned() + "\n";
		}
		
		// generate shields readout
		system.Shields shieldSys = (system.Shields) getInstalledSystem(system.SystemEnum.SHIELDS);
		if (shieldSys != null) {
			rS += "Shield Strength: " + shieldSys.getShieldStrength() + "\n";
			rS += "Shield Capacity: " + shieldSys.getShieldCapacity() + "\n";
		}
		else {rS += "Shields are not currently installed" + "\n";}
		
		// generate weapons readout
		system.Weapons weaponsSys = (system.Weapons) getInstalledSystem(system.SystemEnum.WEAPONS);
		if (weaponsSys != null) {
			for (InstalledWeapon w : weaponsSys.getWeapons()) {
				rS += "Weapon Name: " + w.getName() + " IsPowered?: " + w.isPowered() + " Power Cost: " + w.getPowerReq() + 
					  " Weapon Cooldown: " + w.getCooldown() + "\n";
			}
		}
		else {rS += "Weapons are not currently installed" + "\n";}
		
		return rS;
	}
	
}
