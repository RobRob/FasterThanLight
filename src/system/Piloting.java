package system;

public class Piloting extends SubSystem {
	public Piloting(int startLvl, ship.Ship ship) {
		super(startLvl, ship);
		name = "Piloting";
		type = SystemEnum.PILOTING;
		mannedBonus = true;
		maxLevel = 3;
	}
	
	public void update(double time) {
		
	}
}
