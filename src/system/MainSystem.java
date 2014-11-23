package system;

public abstract class MainSystem extends System {
	protected int power;
	protected int capacity;
	protected int maxCapacity;
	
	public MainSystem(int startPow, int startCap, ship.Ship ship) {
		power = startPow;
		capacity = startCap;
		this.ship = ship;
	}
	
	public int getPower() {return power;}
	public int getCapacity() {return capacity;}
	public int getMaxCapacity() {return maxCapacity;}
	
	public int getSystemLevel() {
		if (getPower() <= getCapacity()-getDamage()) {return getPower();}
		else {return getCapacity()-getDamage();}
	}
	
	public int getSystemCap() {
		return getCapacity();
	}
	
	public boolean sendPower(int p) {
		// also refuse if system ionized or on cooldown
		if (getPower() - p >= 0) {
			power -= p;
			return true;
		}
		else {return false;}
	}
	
	public boolean recievePower(int p) {
		if (getPower() + p <= getCapacity() - getDamage()) {
			power += p;
			return true;
		}
		else {return false;}
	}
}
