package io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PowerListenerFactory {
	
	private GameWindow window;
	private ship.Ship ship;
	
	PowerListenerFactory(GameWindow w, ship.Ship s) {
		window = w;
		ship = s;
	}
	
	public PowerUpListener newPowerUpListener(system.System sys, int p) {
		return new PowerUpListener((system.MainSystem)sys, ship.getReactor(), p);
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
			reactor.modifySystemPower(system, powerAmount);
			window.updateLabels();
		}
	}
	
}
