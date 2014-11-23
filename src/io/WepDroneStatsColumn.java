package io;
import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

public class WepDroneStatsColumn extends JPanel {
	
	ArrayList<JLabel> wepsAndDrones = new ArrayList<JLabel>();
	system.Weapons weaponsSys;
	
	public WepDroneStatsColumn(ship.Ship s) {
		weaponsSys = (system.Weapons)s.getInstalledSystem(system.SystemEnum.WEAPONS);
		setLayout(new GridLayout(0, 1));
		for (int i=0; i<7; i++) {
			wepsAndDrones.add(new JLabel("weps" + i));
			add(wepsAndDrones.get(i));
		}
	}
	
	public void updateLabels() {
		int wepsCount = 0;
		for (system.Weapons.InstalledWeapon w : weaponsSys.getWeapons()) {
			wepsAndDrones.get(wepsCount).setText(w.getName()+ " " + w.getPowerReq());
			wepsCount++;
		}
	}
}
