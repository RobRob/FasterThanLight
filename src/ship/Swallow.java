package ship;

public class Swallow extends Ship {
	public Swallow() {
		
		currentReactorCapacity = 7;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Lanius());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		fuel = 16;
		missiles = 4;
		droneParts = 3;
		
		// 4 max weps, 2 max drones
		// starting weps dual lasers, ion stunner
	}
}
