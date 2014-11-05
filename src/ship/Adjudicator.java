package ship;

public class Adjudicator extends Ship {
	public Adjudicator() {
		currentReactorCapacity = 5;
		
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Zoltan());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.ZoltanShield();
		
		fuel = 16;
		missiles = 12;
		droneParts = 2;
		
		// 4 max weps, 2 max drones
		// starting weps halberd beam, leto
	}
}
