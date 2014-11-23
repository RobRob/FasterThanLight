package system;

public class Sensors extends SubSystem {
	public Sensors(int startLvl, ship.Ship ship) {
		super(startLvl, ship);
		name = "Sensors";
		type = SystemEnum.SENSORS;
		mannedBonus = true;
		maxLevel = 3;
	}
	
	
	public void update(double time) {
		
	}
	// power cap is 4 while manned
}
