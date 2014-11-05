package system;

public class FlakArtillery extends MainSystem {
	public FlakArtillery(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Flak Artillery";
		type = SystemEnum.FLAK_ARTILLERY;
		mannedBonus = false;
		maxCapacity = 4;
	}
}
