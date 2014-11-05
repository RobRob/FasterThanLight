package ship;

public class Kruos extends Ship {
	public Kruos() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Lanius());
		shipCrew.add(new crew.Lanius());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.HACKING, new system.Hacking());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.EmergencyRespirators();
		
		fuel = 16;
		missiles = 3;
		droneParts = 9;
		
		// starting weapons chain laser, ion stunner
		// 4 max weapons, 2 max drones
	}
}
