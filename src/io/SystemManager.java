package io;
import javax.swing.*;
import java.awt.*;

public class SystemManager extends JPanel {
	
	JLabel name = new JLabel();
	JLabel damage = new JLabel();
	JLabel level = new JLabel();
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	GridBagConstraints constraints = new GridBagConstraints();
	
	public SystemManager(system.System sys) {
		setLayout(new GridBagLayout());
		constraints.anchor = constraints.NORTH;
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
			addGB(button1, 2, 0, 1, 3);
			button2.setText("-");
			addGB(button2, 2, 3, 1, 3);
			button3.setText("C");
			addGB(button3, 3, 0, 1, 6);
			break;
		case HACKING : 
			button1.setText("+");
			addGB(button1, 2, 0, 1, 3);
			button2.setText("-");
			addGB(button2, 2, 3, 1, 3);
			button3.setText("H");
			addGB(button3, 3, 0, 1, 6);
			break;
		case MIND_CONTROL :
			button1.setText("+");
			addGB(button1, 2, 0, 1, 3);
			button2.setText("-");
			addGB(button2, 2, 3, 1, 3);
			button3.setText("M");
			addGB(button3, 3, 0, 1, 6);
			break;
		case TELEPORTER :
			button1.setText("+");
			addGB(button1, 2, 0, 1, 3);
			button2.setText("-");
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
			addGB(button1, 2, 0, 2, 3);
			button2.setText("-");
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
		
	}
}
