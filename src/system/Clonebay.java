package system;

public class Clonebay extends MainSystem {
	public Clonebay(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Clonebay";
		type = SystemEnum.CLONEBAY;
		mannedBonus = false;
		maxCapacity = 3;
	}
}
