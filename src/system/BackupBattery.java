package system;

public class BackupBattery extends SubSystem {
	
	private boolean abilityReady;
	private boolean isActive;
	
	private int batteryAmount;
	
	private double abilityDuration;
	private double abilityCooldown;
	private double currentCounter;
	
	public BackupBattery(int startLvl, ship.Ship ship) {
		super(startLvl, ship);
		name = "Backup Battery";
		type = SystemEnum.BACKUP_BATTERY;
		mannedBonus = false;
		maxLevel = 2;
	}
	
	public void update(double time) {
		if (!abilityReady) {
			currentCounter -= time;
			if (currentCounter < 0) {currentCounter = 0;}
			
			if (isActive && currentCounter == 0) {
				isActive = false;
			}
			else if (!isActive && currentCounter == 0) {
				abilityReady = true;
			}
		}
	}
	
	public int useAbility() {
		if (abilityReady) {
			abilityReady = false;
			isActive = true;
			currentCounter = abilityDuration;
			return batteryAmount;
		}
		else {return 0;}
	}
}
