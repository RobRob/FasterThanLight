package ship;

public class Tektite extends Ship {
	public Tektite() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Rock());
		shipCrew.add(new crew.Rock());
		shipCrew.add(new crew.Crystal());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.RockPlating();
		
		fuel = 16;
		missiles = 15;
		droneParts = 0;
		
		// starting weapons swarm, crystal heavy I
		// 4 max weapons, 2 max drones
	}
}
