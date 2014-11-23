package system;

public class Medbay extends MainSystem {
	
	protected double healSpeed = 6.4;
	protected double[] levelBonus = {1, 1.5, 3};
	
	public Medbay(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Medbay";
		type = SystemEnum.MEDBAY;
		mannedBonus = false;
		maxCapacity = 3;
	}
	
	public void update(double time) {
		double healAmount = supplyHealth(time);
		for (layout.Square s : getLocation().getSquareList()) {
			if (s.containsPerson()) {
				s.getCrew().heal(healAmount);
			}
		}
	}
	
	public double supplyHealth(double time) {
		return healSpeed * time * levelBonus[getSystemLevel()];
	}
}
