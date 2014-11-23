package system;

public class Cloaking extends MainSystem {
	
	private boolean abilityReady;
	private boolean isActive;
	private double abilityDuration;
	private double cooldownDuration;
	private double currentCounter;
	
	public Cloaking(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Cloaking";
		type = SystemEnum.CLOAKING;
		mannedBonus = false;
		maxCapacity = 3;
	}
	
	public void update(double time) {
		if (!abilityReady) {
			currentCounter -= time;
			if (currentCounter < 0) {currentCounter = 0;}
			
			if (isActive && currentCounter == 0) {
				isActive = false;
			}
			else if (!isActive && currentCounter == 0) {
				abilityReady = true;
			}
		}
	}
	
	/*public int useAbility() {
		if (abilityReady) {
			abilityReady = false;
			isActive = true;
			currentCounter = abilityDuration;
			return batteryAmount;
		}
		else {return 0;}
	}*/
}
