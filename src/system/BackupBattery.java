package system;

public class BackupBattery extends SubSystem {
	public BackupBattery(int startLvl) {
		super(startLvl);
		name = "Backup Battery";
		type = SystemEnum.BACKUP_BATTERY;
		mannedBonus = false;
		maxLevel = 2;
	}
}
