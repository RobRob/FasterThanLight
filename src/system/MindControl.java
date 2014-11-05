package system;

public class MindControl extends MainSystem {
	public MindControl(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Mind Control";
		type = SystemEnum.MIND_CONTROL;
		mannedBonus = false;
		maxCapacity = 3;
	}
}
