package ship;

public class Cerenkov extends Ship {
	public Cerenkov() {
		currentReactorCapacity = 2;
		
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Zoltan());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.DRONES, new system.Drones());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.ZoltanShield();
		
		fuel = 16;
		missiles = 2;
		droneParts = 15;
		
		// 4 max weps, 2 max drones
		// starting weps ion charge, starting drones beam I
	}
}
