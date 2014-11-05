package ship;

public class Shrike extends Ship {
	public Shrike() {
		
		currentReactorCapacity = 8;
		
		shipCrew.add(new crew.Engi());
		shipCrew.add(new crew.Lanius());
		shipCrew.add(new crew.Lanius());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.MIND_CONTROL, new system.MindControl());
		installedSystems.put(system.SystemEnum.TELEPORTER, new system.Teleporter());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.EmergencyRespirators();
		
		fuel = 16;
		missiles = 0;
		droneParts = 0;
		
		// starting weapons advanced flak
		// 4 max weapons, 2 max drones
	}
}
