package system;

public class FlakArtillery extends MainSystem {
	public FlakArtillery(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Flak Artillery";
		type = SystemEnum.FLAK_ARTILLERY;
		mannedBonus = false;
		maxCapacity = 4;
	}
	
	public void update(double time) {
		
	}
}
