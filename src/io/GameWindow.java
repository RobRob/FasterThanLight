package io;
import javax.swing.*;

import system.SystemEnum;

import java.awt.*;
import java.util.*;

public class GameWindow extends JFrame {
	
	GridBagConstraints constraints = new GridBagConstraints();
	
	private ship.Ship s;
	private CrewStatsColumn csc;
	private WepDroneStatsColumn wdsc;
	private ShipStatsBar shsb;
	private SystemStatsBar sysb;
	
	public GameWindow(ship.Ship s) {
		this.s = s;
		setSize(966, 600);
		setTitle("Faster than FTL");
		setLayout(new BorderLayout());
		
		csc = new CrewStatsColumn(s);
		add(csc, BorderLayout.WEST);
		
		wdsc = new WepDroneStatsColumn(s);
		add(wdsc, BorderLayout.EAST);
		
		shsb = new ShipStatsBar(s);
		add(shsb, BorderLayout.NORTH);
		
		sysb = new SystemStatsBar(s);
		add(sysb, BorderLayout.SOUTH);

		updateLabels();
		setVisible(true);
	}
	
	public void updateLabels() {
		csc.updateLabels();
		wdsc.updateLabels();
		shsb.updateLabels();
		sysb.updateLabels();
	}
}
