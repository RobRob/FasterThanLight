package ship;

public class Tetragon extends Ship {
	public Tetragon() {
		
		currentReactorCapacity = 9;
		
		shipCrew.add(new crew.Lanius());
		shipCrew.add(new crew.Engi());
		shipCrew.add(new crew.Engi());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.CLONEBAY, new system.Clonebay());
		installedSystems.put(system.SystemEnum.DRONES, new system.Drones());
		installedSystems.put(system.SystemEnum.HACKING, new system.Hacking());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.DefenseScrambler();
		
		fuel = 16;
		missiles = 0;
		droneParts = 25;
		
		// 3 max weps, 3 max drones
		// starting weps dual lasers, starting drones beam I
	}
}
