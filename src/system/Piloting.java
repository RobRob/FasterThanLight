package system;

public class Piloting extends SubSystem {
	public Piloting(int startLvl) {
		super(startLvl);
		name = "Piloting";
		type = SystemEnum.PILOTING;
		mannedBonus = true;
		maxLevel = 3;
	}
}
