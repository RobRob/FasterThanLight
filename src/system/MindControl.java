package system;

public class MindControl extends MainSystem {
	public MindControl(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Mind Control";
		type = SystemEnum.MIND_CONTROL;
		mannedBonus = false;
		maxCapacity = 3;
	}
	
	public void update(double time) {
		
	}
}
