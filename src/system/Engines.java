package system;

public class Engines extends MainSystem {
	
	private double ftlChargeReq;
	private double currentFTLCharge;
	private double chargeRate;
	
	public Engines(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Engines";
		type = SystemEnum.ENGINES;
		power = startPow;
		capacity = startCap;
		mannedBonus = true;
		maxCapacity = 8;
	}
	
	public void update(double time) {
		currentFTLCharge += time*chargeRate;
		if (currentFTLCharge > ftlChargeReq) {
			currentFTLCharge = ftlChargeReq;
		}
	}
}
