package ship;

public class ManOfWar extends Ship {
	public ManOfWar() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Slug());
		shipCrew.add(new crew.Slug());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.SlugRepairGel();
		
		fuel = 16;
		missiles = 15;
		droneParts = 0;
		
		// 4 max weps, 2 max drones
		// starting weps anti-bio beam, breach bomb I, dual lasers
	}
}
