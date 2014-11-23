package system;

public class Doors extends SubSystem {
	public Doors(int startLvl, ship.Ship ship) {
		super(startLvl, ship);
		name = "Doors";
		type = SystemEnum.DOORS;
		mannedBonus = true;
		maxLevel = 3;
	}
	
	
	public void update(double time) {
		
	}
	// power capacity is 4 while manned
}
