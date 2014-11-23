package io;
import javax.swing.*;

import system.SystemEnum;

import java.awt.*;
import java.util.*;

public class GameWindow extends JFrame {
	
	GridBagConstraints constraints = new GridBagConstraints();
	
	private ship.Ship sI;
	private JLabel hull = new JLabel("hull");
	private JLabel shields = new JLabel("shields");
	private JLabel fuel = new JLabel("fuel");
	private JLabel missiles = new JLabel("missiles");
	private JLabel drones = new JLabel("drones");
	private JLabel scrip = new JLabel("scrip");
	
	private JLabel evade = new JLabel("evade");
	private JLabel oxygen = new JLabel("oxygen");
	private JLabel power = new JLabel("power");
	
	ArrayList<JLabel> crew = new ArrayList<JLabel>();
	ArrayList<JLabel> wepsAndDrones = new ArrayList<JLabel>();
	ArrayList<JLabel> systems = new ArrayList<JLabel>();
	
	public GameWindow(ship.Ship sI) {
		this.sI = sI;
		setSize(600, 500);
		setTitle("Faster than FTL");
		setLayout(new GridBagLayout());
		
		addGB(hull, 0, 0, 2, 1);
		addGB(shields, 2, 0, 2, 1);
		addGB(fuel, 4, 0, 2, 1);
		addGB(missiles, 6, 0, 2, 1);
		addGB(drones, 8, 0, 2, 1);
		addGB(scrip, 10, 0, 2, 1);
		
		addGB(evade, 3, 1, 3, 1);
		addGB(oxygen, 6, 1, 3, 1);
		addGB(power, 9, 1, 3, 1);
		
		constraints.gridx = 4;
		constraints.gridy = 2;
		constraints.gridwidth = 9;
		constraints.gridheight = 7;
		constraints.weightx = 1;
		constraints.weighty = 1;
		add(new JLabel("placeholder"), constraints);

		for (int i=0; i<8; i++) {
			crew.add(new JLabel("crew" + i));
			addGB(crew.get(i), 0, i+1, 3, 1);
			
		}
		
		for (int i=0; i<7; i++) {
			wepsAndDrones.add(new JLabel("weps" + i));
			addGB(wepsAndDrones.get(i), 9, i+2, 3, 1);
		}

		for (int i=0; i<12; i++) {
			systems.add(new JLabel("sys" + i));
			addGB(systems.get(i), i, 9, 1, 2);
		}
		updateLabels();
		setVisible(true);
	}
	
	private void addGB(Component component, int x, int y, int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(component, constraints);
	}
	
	public void updateLabels() {
		hull.setText("Hull: "+sI.getHull()+"/"+sI.getMaxHull());
		
		system.Shields sh = (system.Shields)sI.getInstalledSystem(SystemEnum.SHIELDS);
		shields.setText("Shields: "+sh.getShieldStrength()+"/"+sh.getShieldCapacity());
		
		shipComponents.Inventory inv = sI.getInventory();
		fuel.setText("Fuel: "+inv.getFuel());
		missiles.setText("Missiles: "+inv.getMissiles());
		drones.setText("Drones: "+inv.getDrones());
		
		evade.setText("Evade: "+sI.getEvasion()+"%");
		oxygen.setText("Oxygen: "+sI.getOxygen()+"%");
		
		shipComponents.Reactor react = sI.getReactor();
		power.setText("Power: "+ react.getPower()+ "/"+react.getCapacity());
		
		int crewCount = 0;
		for (crew.Crew c : sI.getShipCrew()) {
			crew.get(crewCount).setText(c.getName()+ " " + c.getRace().toString());
			crewCount++;
		}
		
		int wepsCount = 0;
		system.Weapons weps = (system.Weapons)sI.getInstalledSystem(system.SystemEnum.WEAPONS);
		for (system.Weapons.InstalledWeapon w : weps.getWeapons()) {
			wepsAndDrones.get(wepsCount).setText(w.getName()+ " " + w.getPowerReq());
			wepsCount++;
		}
		
		int systemsCount = 0;
		for (Map.Entry<system.SystemEnum, system.System> sys : sI.getInstalledSystems().entrySet()) {
			systems.get(systemsCount).setText(sys.getValue().getName() + " " + sys.getValue().getSystemLevel());
			systemsCount++;
		}
		
	}
}
