package ship;

public class Nisos extends Ship {
	public Nisos() {
		
		currentReactorCapacity = 9;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Slug());
		
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
		missiles = 9;
		droneParts = 0;
		
		// 4 max weps, 2 max drones
		// starting weps dual lasers, leto
	}
}
