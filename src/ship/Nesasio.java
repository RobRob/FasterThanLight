package ship;

public class Nesasio extends Ship {
	public Nesasio() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Human());
		
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.CLOAKING, new system.Cloaking());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.LongRangeScanners();
		installedAugmentations[1] = new augmentation.TitaniumSystemCasing();
		
		fuel = 16;
		missiles = 0;
		droneParts = 0;
		
		// starting weapons mini beam, dual lasers
		// 3 max weapons, 2 max drones
	}
}
