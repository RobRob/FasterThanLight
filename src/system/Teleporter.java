package system;

public class Teleporter extends MainSystem {
	public Teleporter(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Teleporter";
		type = SystemEnum.TELEPORTER;
		mannedBonus = false;
		maxCapacity = 3;
	}
}
