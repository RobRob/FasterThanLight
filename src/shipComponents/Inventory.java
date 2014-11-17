package shipComponents;

public class Inventory {
	
	private int fuel, missiles, drones;
	
	public Inventory(int f, int m, int d) {
		fuel = f;
		missiles = m;
		drones = d;
	}
	
	public int getFuel() {return fuel;}
	public int getMissiles() {return missiles;}
	public int getDrones() {return drones;}
	
	public void modifyFuel(int f) {fuel += f;}
	public void modifyMissiles(int m) {missiles += m;}
	public void modifyDrones(int d) {drones += d;}
	
	public boolean canUseFuel(int f) {
		if (fuel - getFuel() >= 0) {return true;}
		else {return false;}
	}
	
	public boolean canUseMissiles(int m) {
		if (missiles - getMissiles() >= 0) {return true;}
		else {return false;}
	}
	
	public boolean canUseDroneParts(int d) {
		if (drones - getDrones() >= 0) {return true;}
		else {return false;}
	}
}
