package ship;

public class Stormwalker extends Ship {
	public Stormwalker() {
		
		currentReactorCapacity = 7;
		
		shipCrew.add(new crew.Slug());
		shipCrew.add(new crew.Slug());
		shipCrew.add(new crew.Slug());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.TELEPORTER, new system.Teleporter());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.SlugRepairGel();	
		
		fuel = 16;
		missiles = 25;
		droneParts = 0;
		
		// 4 max weps, 2 max drones
		// starting weps healing burst, artemis
	}
}
