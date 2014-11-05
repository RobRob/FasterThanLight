package ship;

public class SimoH extends Ship {
	public SimoH() {
		
		currentReactorCapacity = 7;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Rock());
		shipCrew.add(new crew.Slug());
		
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.DRONES, new system.Drones());
		installedSystems.put(system.SystemEnum.CLOAKING, new system.Cloaking());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.LongRangeScanners();
		
		fuel = 16;
		missiles = 0;
		droneParts = 16;
		
		// starting weapons charge laser+, mini beam, starting drones shield+, anti-drone
		// 3 max weapons, 3 max drones
	}
}
