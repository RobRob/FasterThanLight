package system;

public class Oxygen extends MainSystem {
	// game refill speed = 2.4, 4.8, 8.4
	// oxygen loss speed = 1.2
	// game net oxygen = 1.2, 3.6, 7.2
	protected double refillSpeed = 2.4; // refill 2.4 oxygen per second
	protected double[] levelBonus = {1, 2, 4};
	
	public Oxygen(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Oxygen";
		type = SystemEnum.OXYGEN;
		mannedBonus = false;
		maxCapacity = 3;
	}
	
	public void update(double time) {
		
	}
	
	public double supplyOxygen(double time) {
		return refillSpeed * time * levelBonus[getSystemLevel()];
	}
}
