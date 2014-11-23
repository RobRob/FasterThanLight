package io;
import java.awt.GridBagLayout;

import javax.swing.*;

import system.SystemEnum;

import java.awt.*;
public class ShipStatsBar extends JPanel {
	
	private ship.Ship s;
	private JLabel hull = new JLabel("hull");
	private JLabel shields = new JLabel("shields");
	private JLabel fuel = new JLabel("fuel");
	private JLabel missiles = new JLabel("missiles");
	private JLabel drones = new JLabel("drones");
	private JLabel scrip = new JLabel("scrip");
	private JLabel evade = new JLabel("evade");
	private JLabel oxygen = new JLabel("oxygen");
	private JLabel power = new JLabel("power");
	
	public ShipStatsBar(ship.Ship s) {
		this.s = s;
		setLayout(new GridLayout(1, 0));
		hull.setHorizontalAlignment(SwingConstants.CENTER);
		add(hull);
		shields.setHorizontalAlignment(SwingConstants.CENTER);
		add(shields);
		fuel.setHorizontalAlignment(SwingConstants.CENTER);
		add(fuel);
		missiles.setHorizontalAlignment(SwingConstants.CENTER);
		add(missiles);
		drones.setHorizontalAlignment(SwingConstants.CENTER);
		add(drones);
		scrip.setHorizontalAlignment(SwingConstants.CENTER);
		add(scrip);
		evade.setHorizontalAlignment(SwingConstants.CENTER);
		add(evade);
		oxygen.setHorizontalAlignment(SwingConstants.CENTER);
		add(oxygen);
		power.setHorizontalAlignment(SwingConstants.CENTER);
		add(power);
	}
	
	public void updateLabels() {
		hull.setText("Hull: "+s.getHull()+"/"+s.getMaxHull());
		
		system.Shields sh = (system.Shields)s.getInstalledSystem(SystemEnum.SHIELDS);
		shields.setText("Shields: "+sh.getShieldStrength()+"/"+sh.getShieldCapacity());
		
		shipComponents.Inventory inv = s.getInventory();
		fuel.setText("Fuel: "+inv.getFuel());
		missiles.setText("Missiles: "+inv.getMissiles());
		drones.setText("Drones: "+inv.getDrones());
		
		evade.setText("Evade: "+s.getEvasion()+"%");
		oxygen.setText("Oxygen: "+s.getOxygen()+"%");
		
		shipComponents.Reactor react = s.getReactor();
		power.setText("Power: "+ react.getPower()+ "/"+react.getCapacity());
	}
}
