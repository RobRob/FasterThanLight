package ship;

public class Ariolimax extends Ship {
	public Ariolimax() {
		
		currentReactorCapacity = 9;
		
		shipCrew.add(new crew.Slug());
		shipCrew.add(new crew.Slug());
		shipCrew.add(new crew.Slug());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.HACKING, new system.Hacking());
		installedSystems.put(system.SystemEnum.MIND_CONTROL, new system.MindControl());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.SlugRepairGel();
		
		fuel = 16;
		missiles = 1;
		droneParts = 15;
		
		// 4 max weps, 2 max drones
		// starting weps chain laser
	}
}
