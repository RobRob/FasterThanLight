package shipComponents;

public class Reactor {
	
	private int currentPower, currentCapacity, maxCapacity = 25;
	
	public Reactor(int currP, int maxP) {
		currentPower = currP;
		currentCapacity = maxP;
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
}
