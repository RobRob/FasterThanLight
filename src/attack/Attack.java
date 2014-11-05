package attack;

public class Attack {
	protected int damage;
	protected int speed;
	protected int pierceAmount;
	
	protected boolean canDamageShield;
	
	protected ship.Ship targetShip;
	protected int[] targetCoordinates;
	
	protected double fireChance;
	protected double breachChance;
	protected double stunChance;
	
	protected boolean attackFailed;
	
	public Attack(int dmg, int sp, int pA, boolean cDS, ship.Ship ship, int[] tgt, double fC, double bC, double sC) {
		damage = dmg;
		speed = sp;
		pierceAmount = pA;
		
		canDamageShield = cDS;
		
		targetShip = ship;
		targetCoordinates = tgt;
		
		fireChance = fC;
		breachChance = bC;
		stunChance = sC;
		
		// wait a little bit and then call a method to handle the attack hitting the target
		// chance to get shot down, (then wait) chance to miss, chance to hit shields
	}
	
	public double getPierceAmount() {return pierceAmount;}
	public int getDamage() {return damage;}
	
	public void reduceDamage(int r) {
		damage -= r;
	}
	
	public boolean canDamageShield() {
		return canDamageShield;
	}
	
	public void setAttackFailed(boolean b) {
		attackFailed = b;
	}
}
