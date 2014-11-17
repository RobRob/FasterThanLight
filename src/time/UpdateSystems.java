package time;
import java.util.*;

import ship.*;

public class UpdateSystems implements Runnable {
	
	private Ship ship;
	
	public UpdateSystems(Ship s) {
		ship = s;
	}
	
	public void run() {
		long updateStartTime;
		double updateTime = 0;
		boolean finished = false;
		while (!finished) {
			updateStartTime = new Date().getTime();
			for (Map.Entry<system.SystemEnum, system.System> sysEntry : ship.getInstalledSystems().entrySet()) {
				sysEntry.getValue().update(updateTime);
			}
			updateTime = (new Date().getTime() - updateStartTime)/1000;
		}
	}
}
