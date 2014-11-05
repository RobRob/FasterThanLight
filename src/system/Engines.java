package system;

public class Engines extends MainSystem {
	public Engines(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Engines";
		type = SystemEnum.ENGINES;
		power = startPow;
		capacity = startCap;
		mannedBonus = true;
		maxCapacity = 8;
	}
}
