package system;

import java.util.*;

public class Drones extends MainSystem {
	
	protected ArrayList<drone.Drone> drones = new ArrayList<drone.Drone>();
	protected int maxDrones;
	
	public Drones(int startPow, int startCap, ArrayList<drone.Drone> startDrones, int maxDrones, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Drones";
		type = SystemEnum.DRONES;
		mannedBonus = false;
		maxCapacity = 8;
		
		for (drone.Drone d : startDrones) {drones.add(d);}
		this.maxDrones = maxDrones;
	}
	
	public void update(double time) {
		
	}
}
