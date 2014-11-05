package ship;

public class Torus extends Ship {
	public Torus() {
		
		currentReactorCapacity = 10;
		
		shipCrew.add(new crew.Human());
		shipCrew.add(new crew.Engi());
		shipCrew.add(new crew.Engi());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.DRONES, new system.Drones());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());

		installedAugmentations[0] = new augmentation.EngiMedbotDispersal();
		
		fuel = 16;
		missiles = 0;
		droneParts = 15;
		
		// 3 max weps, 3 max drones
		// starting weps ion blast II, starting drones combat I
	}
}
