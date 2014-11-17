package ship;

public class Kestrel extends Ship {
	
	public Kestrel() {
		
		hull = 30;
		maxHull = 30;
		
		reactor = new shipComponents.Reactor(3, 8);
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Human());
		
		weapon.Weapon[] startingWeapons = {new weapon.Artemis(), new weapon.BurstLaserII()};
		
		maxWeapons = 4;
		maxDrones = 2;
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields(2, 2));
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines(1, 2));
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen(1, 1));
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons(0, 3, startingWeapons, maxWeapons));
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay(1, 1));
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting(1));
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors(1));
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors(1));
		
		inventory = new shipComponents.Inventory(16, 8, 2);
		
		shipRepresentation = new String[][]{
				{"--","--","--","--","--","--","R1","R1","--","--","--","--","--","--","--"},
				{"--","OX","OX","R2","R2","HU","R3","R3","ME","ME","--","--","--","--","--"},
				{"R4","EN","EN","HU","WE","WE","R3","R3","ME","ME","DO","DO","R5","R5","PI"},
				{"R4","EN","EN","HU","WE","WE","R6","R6","SH","SH","SE","SE","R5","R5","PI"},
				{"--","R7","R7","R8","R8","HU","R6","R6","SH","SH","--","--","--","--","--"},
				{"--","--","--","--","--","--","R9","R9","--","--","--","--","--","--","--"}
		};
		
		divideRepresentation = new String[][]{
				{":",":",":",":",":",":","as:w","d:ws",":",":",":",":",":",":",":"},
				{":","was:","w:ds","ws:a","wd:s",":","wa:",":wd","w:a","wd:",":",":",":",":",":"},
				{"w:ad","w:a","d:w",":","a:w","w:d","s:a","sd","a:s","s:d","ws:a","ws:d","w:a","wd:","wad:"},
				{"s:ad","s:a","d:s",":","a:s","s:d","w:a","wd","a:w","w:d","ws:a","ws:d","s:a","s:d","sd:a"},
				{":","as:","s:wd","sw:a","sd:w",":","sa:",":sd","s:a","sd",":",":",":",":",":"},
				{":",":",":",":",":",":","aw:s","d:sw",":",":",":",":",":",":",":"}
		};
		
		setUpRooms();
		setUpRoutePlan();
		
		// could be streamlined by having a common priority list for all ships that while it has crew, fills rooms with the crew
		rooms.get("PI").firstFreeSquare().setCrew(shipCrew.get(0));
		rooms.get("WE").firstFreeSquare().setCrew(shipCrew.get(1));
		rooms.get("EN").firstFreeSquare().setCrew(shipCrew.get(2));
	}
}
