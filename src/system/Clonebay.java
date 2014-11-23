package system;
import java.util.*;

public class Clonebay extends MainSystem {
	
	private ArrayList<crew.Crew> cloneQueue = new ArrayList<crew.Crew>();
	private double totalCloneTime;
	private double currentCloneTime;
	
	public Clonebay(int startPow, int startCap, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Clonebay";
		type = SystemEnum.CLONEBAY;
		mannedBonus = false;
		maxCapacity = 3;
	}
	
	public void update(double time) {
		currentCloneTime -= time;
		if (currentCloneTime < 0) {currentCloneTime = 0;}
	}
	
	public void recieveCrew(crew.Crew c) {
		cloneQueue.add(c);
	}
	
	public crew.Crew returnCrew() {
		return cloneQueue.remove(0);
	}
}
