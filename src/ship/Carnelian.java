package ship;

public class Carnelian extends Ship {
	public Carnelian() {
currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Crystal());
		shipCrew.add(new crew.Crystal());
		shipCrew.add(new crew.Crystal());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.TELEPORTER, new system.Teleporter());
		installedSystems.put(system.SystemEnum.CLOAKING, new system.Cloaking());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.CrystalVengeance();
		
		fuel = 16;
		missiles = 0;
		droneParts = 0;
		
		// no starting weapons
		// 4 max weapons, 2 max drones
	}
}
