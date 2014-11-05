package ship;

public class Osprey extends Ship {
	public Osprey() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Mantis());
		shipCrew.add(new crew.Rock());
		shipCrew.add(new crew.Engi());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.ARTILLERY_BEAM, new system.ArtilleryBeam());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		fuel = 16;
		missiles = 5;
		droneParts = 2;
		
		// 4 max weps, 2 max drones
		// starting weps burst laser II
	}
}
