package io;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemManager extends JPanel {
	
	system.System sys;
	shipComponents.Reactor r;
	
	JLabel name = new JLabel();
	JLabel damage = new JLabel();
	JLabel level = new JLabel();
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	GridBagConstraints constraints = new GridBagConstraints();
	
	public SystemManager(system.System sys, shipComponents.Reactor r) {
		this.r = r;
		this.sys = sys;
		setLayout(new GridBagLayout());
		name.setText(sys.getName());
		addGB(name, 0, 0, 2, 2);
		
		damage.setText(""+sys.getDamage());
		addGB(damage, 0, 2, 2, 2);
		
		level.setText(sys.getSystemLevel()+"/"+sys.getSystemCap());
		addGB(level, 0, 4, 2, 2);
		
		switch (sys.getType()) {
		case BACKUP_BATTERY : 
			button1.setText("+Pow");
			addGB(button1, 2, 0, 2, 6);
			break;
		case DOORS :
			button1.setText("|  |");
			addGB(button1, 2, 0, 2, 3);
			button2.setText(" || ");
			addGB(button2, 2, 3, 2, 3);
			break;
		case CLOAKING :
			button1.setText("+");
			button1.addActionListener(new PowerUpListener((system.MainSystem)sys, r, 1));
			addGB(button1, 2, 0, 1, 3);
			button2.setText("-");
			button2.addActionListener(new PowerDownListener((system.MainSystem)sys, r, 1));
			addGB(button2, 2, 3, 1, 3);
			button3.setText("C");
			addGB(button3, 3, 0, 1, 6);
			break;
		case HACKING : 
			button1.setText("+");
			button1.addActionListener(new PowerUpListener((system.MainSystem)sys, r, 1));
			addGB(button1, 2, 0, 1, 3);
			button2.setText("-");
			button2.addActionListener(new PowerDownListener((system.MainSystem)sys, r, 1));
			addGB(button2, 2, 3, 1, 3);
			button3.setText("H");
			addGB(button3, 3, 0, 1, 6);
			break;
		case MIND_CONTROL :
			button1.setText("+");
			button1.addActionListener(new PowerUpListener((system.MainSystem)sys, r, 1));
			addGB(button1, 2, 0, 1, 3);
			button2.setText("-");
			button2.addActionListener(new PowerDownListener((system.MainSystem)sys, r, 1));
			addGB(button2, 2, 3, 1, 3);
			button3.setText("M");
			addGB(button3, 3, 0, 1, 6);
			break;
		case TELEPORTER :
			button1.setText("+");
			button1.addActionListener(new PowerUpListener((system.MainSystem)sys, r, 1));
			addGB(button1, 2, 0, 1, 3);
			button2.setText("-");
			button2.addActionListener(new PowerDownListener((system.MainSystem)sys, r, 1));
			addGB(button2, 2, 3, 1, 3);
			button3.setText("<-");
			addGB(button3, 3, 0, 1, 3);
			button4.setText("->");
			addGB(button4, 3, 3, 1, 3);
			break;
		case PILOTING : case SENSORS : case WEAPONS : case DRONES :
			break;
		default :
			button1.setText("+");
			button1.addActionListener(new PowerUpListener((system.MainSystem)sys, r, 1));
			addGB(button1, 2, 0, 2, 3);
			
			button2.setText("-");
			button2.addActionListener(new PowerDownListener((system.MainSystem)sys, r, 1));
			addGB(button2, 2, 3, 2, 3);
			break;
		}
	}
	
	public void addGB(Component c, int x, int y, int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}
	
	public void updateLabels() {
		name.setText(sys.getName());
		damage.setText(""+sys.getDamage());
		level.setText(sys.getSystemLevel()+"/"+sys.getSystemCap());
	}
	
	public class PowerUpListener implements ActionListener {
		
		private system.MainSystem system;
		private shipComponents.Reactor reactor;
		private int powerAmount;
		
		public PowerUpListener(system.MainSystem sys, shipComponents.Reactor r, int p) {
			system = sys;
			reactor = r;
			powerAmount = p;
		}
		
		public void actionPerformed(ActionEvent e) {
			reactor.sendPower(system, powerAmount);
			GameWindow topLevelWindow = (GameWindow)SystemManager.this.getTopLevelAncestor();
			topLevelWindow.updateLabels();
		}
	}
	
	public class PowerDownListener implements ActionListener {
		
		private system.MainSystem system;
		private shipComponents.Reactor reactor;
		private int powerAmount;
		
		public PowerDownListener(system.MainSystem sys, shipComponents.Reactor r, int p) {
			system = sys;
			reactor = r;
			powerAmount = p;
		}
		
		public void actionPerformed(ActionEvent e) {
			reactor.recievePower(system, powerAmount);
			GameWindow topLevelWindow = (GameWindow)SystemManager.this.getTopLevelAncestor();
			topLevelWindow.updateLabels();
		}
	}
	
}

