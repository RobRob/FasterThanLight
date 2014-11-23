package io;
import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

public class CrewStatsColumn extends JPanel {
	
	private ArrayList<crew.Crew> shipCrew;
	private ArrayList<JLabel> crew = new ArrayList<JLabel>();
	
	public CrewStatsColumn(ship.Ship s) {
		shipCrew = s.getShipCrew();
		setLayout(new GridLayout(0, 1));
		for (int i=0; i<8; i++) {
			crew.add(new JLabel("crew" + i));
			add(crew.get(i));
		}
	}
	
	public void updateLabels() {
		int crewCount = 0;
		for (crew.Crew c : shipCrew) {
			crew.get(crewCount).setText(c.getName()+ " " + c.getRace().toString());
			crewCount++;
		}
	}
}
