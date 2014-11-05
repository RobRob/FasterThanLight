package system;

public class Cloaking extends MainSystem {
	
	boolean isActive;
	
	public Cloaking(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Cloaking";
		type = SystemEnum.CLOAKING;
		mannedBonus = false;
		maxCapacity = 3;
	}
}
