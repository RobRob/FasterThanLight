package system;

public class Doors extends SubSystem {
	public Doors(int startLvl) {
		super(startLvl);
		name = "Doors";
		type = SystemEnum.DOORS;
		mannedBonus = true;
		maxLevel = 3;
	}
	
	// power capacity is 4 while manned
}
