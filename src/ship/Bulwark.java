package ship;

public class Bulwark extends Ship {
	public Bulwark() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Rock());
		shipCrew.add(new crew.Rock());
		shipCrew.add(new crew.Rock());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.RockPlating();
		
		fuel = 16;
		missiles = 28;
		droneParts = 0;
		
		// starting weapons artemis, hull missile
		// 4 max weapons, 2 max drones
	}
}
