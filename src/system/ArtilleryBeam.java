package system;

public class ArtilleryBeam extends MainSystem {
	
	private double totalChargeTime;
	private double remainingChargeTime;
	
	public ArtilleryBeam(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Artillery Beam";
		type = SystemEnum.ARTILLERY_BEAM;
		mannedBonus = false;
		maxCapacity = 4;
	}
	
	public void update(double time) {
		remainingChargeTime -= time;
		if (remainingChargeTime < 0) {
			remainingChargeTime = 0;
		}
	}
}
