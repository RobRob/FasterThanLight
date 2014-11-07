package weapon;

public abstract class Weapon {
	
	// INSTANCE VARIABLES
	
	protected String name;
	protected int powerReq;
	protected int cost;
	
	protected double cooldown;
	protected int firingSpeed;
	
	protected int piercing = 0;
	protected double fire = 0.0;
	protected double breach = 0.0;
	protected double stun = 0.0;
	
	// GET AND SET METHODS
	
	public String getName() {return name;}
	public int getPowerReq() {return powerReq;}
	public int getBuyPrice() {return cost;}
	public int getSellPrice() {return (int) Math.floor(cost/2);}
	
	public double getCooldown() {return cooldown;}
	public int firingSpeed() {return firingSpeed;}
	
	public int getPiercing() {return piercing;}
	public double getFireChance() {return fire;}
	public double getBreachChance() {return breach;}
	public double getStunChance() {return stun;}
	
	// OTHER METHODS
}
