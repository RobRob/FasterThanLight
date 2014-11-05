package ship;

public class DASR12 extends Ship {
	public DASR12() {
		
		currentReactorCapacity = 7;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Zoltan());
		
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.CLOAKING, new system.Cloaking());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.LongRangeScanners();
		
		fuel = 16;
		missiles = 0;
		droneParts = 0;
		
		// starting weapons glaive beam
		// 3 max weapons, 2 max drones
	}
}
