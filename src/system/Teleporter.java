package system;

public class Teleporter extends MainSystem {
	public Teleporter(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Teleporter";
		type = SystemEnum.TELEPORTER;
		mannedBonus = false;
		maxCapacity = 3;
	}
	
	public void update(double time) {
		
	}
}
