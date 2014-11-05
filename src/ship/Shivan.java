package ship;

public class Shivan extends Ship {
	public Shivan() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Rock());
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
		
		installedAugmentations[0] = new augmentation.RockPlating();
		
		fuel = 16;
		missiles = 18;
		droneParts = 0;
		
		// starting weapons heavy pierce I, fire bomb
		// 4 max weapons, 2 max drones
	}
}
