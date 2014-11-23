package system;

public class Hacking extends MainSystem {
	public Hacking(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Hacking";
		type = SystemEnum.HACKING;
		mannedBonus = false;
		maxCapacity = 3;
	}
	
	public void update(double time) {
		
	}
}
