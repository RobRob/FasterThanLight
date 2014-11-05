package system;

public class Sensors extends SubSystem {
	public Sensors(int startLvl) {
		super(startLvl);
		name = "Sensors";
		type = SystemEnum.SENSORS;
		mannedBonus = true;
		maxLevel = 3;
	}
	
	// power cap is 4 while manned
}
