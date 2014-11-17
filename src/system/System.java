package system;

public abstract class System {
	
	protected String name;
	protected SystemEnum type;
	protected boolean mannedBonus;
	protected int damage = 0;
	
	layout.Room location;
	
	public String getName() {return name;}
	public SystemEnum getType() {return type;}
	public int getDamage() {return damage;}
	
	public boolean isManned() { // return true if someone is activating the system
		if(location.containsPerson()) {return true;}
		else {return false;}
	}
	
	public int getCrewLevel(system.SystemEnum sys) {
		return 0;
	}
	
	public abstract int getSystemLevel();
	public abstract int getSystemCap();
	
	public abstract void update(double time);
	
	// make a general is active method
	public layout.Room getLocation() {return location;}
	public void setLocation(layout.Room r) {location = r;}
	
	public boolean isActive() {
		if (getSystemLevel() > 0) {
			return true;
		}
		return false;
	}

}
