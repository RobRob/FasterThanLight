package ship;

public class RedTail extends Ship {
	public RedTail() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Mantis());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		fuel = 16;
		missiles = 5;
		droneParts = 0;
		
		// 4 max weapons, 2 max drones
		// starting weapons 4 basic lasers
	}
}
