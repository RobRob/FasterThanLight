package ship;

public class Fregatidae extends Ship {
	public Fregatidae() {
		
		currentReactorCapacity = 7;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Zoltan());
		shipCrew.add(new crew.Mantis());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.TELEPORTER, new system.Teleporter());
		installedSystems.put(system.SystemEnum.FLAK_ARTILLERY, new system.FlakArtillery());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.EmergencyRespirators();
		
		fuel = 16;
		missiles = 5;
		droneParts = 0;
		
		// 4 max weps, 2 max drones
		// no starting weapons
	}
}
