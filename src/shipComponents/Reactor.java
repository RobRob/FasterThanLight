package shipComponents;
import java.util.*;

public class Reactor {
	
	private ship.Ship ship;
	private int currentPower, currentCapacity, maxCapacity = 25;
	
	public Reactor(int currP, int maxP, ship.Ship ship) {
		currentPower = currP;
		currentCapacity = maxP;
		this.ship = ship;
	}
	
	public int getPower() {return currentPower;}
	public int getCapacity() {return currentCapacity;}
	public int getMaxCapacity() {return maxCapacity;}
	
	public void modifyReactorPower(int p) {
		currentPower += p;
	}
	
	// one method for adding and subtracting system power. negative power = power -> reactor, positive = power -> system
	public boolean modifySystemPower(system.MainSystem sys, int power) {
		if (power > 0) {
			if (getPower() < power) {return false;}
			else if (sys.recievePower(power)) {
				modifyReactorPower(-power);
				return true;
			}
			else {return false;}
		}
		else if (power < 0) {
			if (getPower() + power > getMaxCapacity()) {return false;}
			else if (sys.sendPower(power)) {
				modifyReactorPower(power);
				return true;
			}
			else {return false;}
		}
		else {return false;}
	}
	
	public void gainBonusPower(int b) {
		currentPower += b;
		currentCapacity += b;
		maxCapacity += b;
	}
	
	public void loseBonusPower(int b) {
		currentPower -= b;
		currentCapacity -= b;
		maxCapacity -= b;
		if (currentPower < 0) {
			reclaimPower(0 - currentPower, ship.getInstalledSystems());
		}
	}
	
	public void reclaimPower(int p, Map<system.SystemEnum, system.System> m) {
		// go through the other systems on the ship and grab power to remove the deficit
	}
}
