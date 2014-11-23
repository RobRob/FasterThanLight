package io;

import javax.swing.*;

import java.awt.*;
import java.util.*;

public class SystemStatsBar extends JPanel {
	
	ArrayList<SystemManager> systems = new ArrayList<SystemManager>();
	Set<Map.Entry<system.SystemEnum, system.System>> sysSet;
	
	public SystemStatsBar(ship.Ship s) {
		sysSet = s.getInstalledSystems().entrySet();
		setLayout(new GridLayout(1, 0));
		for (Map.Entry<system.SystemEnum, system.System> sys : sysSet) {
			if (sys.getValue() != null) {
				systems.add(new SystemManager(sys.getValue()));
			}
		}
		for (SystemManager sm : systems) {
			add(sm);
		}
	}
	
	public void updateLabels() {
		int systemsCount = 0;
		for (Map.Entry<system.SystemEnum, system.System> sys : sysSet) {
			systems.get(systemsCount).updateLabels();
			systemsCount++;
		}
	}
}
