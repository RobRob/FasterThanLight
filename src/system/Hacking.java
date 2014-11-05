package system;

public class Hacking extends MainSystem {
	public Hacking(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Hacking";
		type = SystemEnum.HACKING;
		mannedBonus = false;
		maxCapacity = 3;
	}
}
