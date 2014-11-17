package system;

import time.Updateable;

public class Shields extends MainSystem implements Updateable {
	
	protected double shieldStrength;
	protected double shieldCapacity;
	protected double chargeSpeed;
	
	public Shields(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Shields";
		type = SystemEnum.SHIELDS;
		mannedBonus = true;
		maxCapacity = 8;
		
		shieldStrength = 1.0;
		shieldCapacity = 1.0;
		chargeSpeed = 0.5; //fills up 0.5 shield per second
	}
	
	public double getShieldStrength() {return shieldStrength;}
	public double getShieldCapacity() {return shieldCapacity;}
	public double getChargeSpeed() {return chargeSpeed;}
	
	public void update(double time) {
		shieldStrength += chargeSpeed*time;
		if (shieldStrength > shieldCapacity) {shieldStrength = shieldCapacity;}
	}
	
	public void shieldFromAttack(attack.Attack a) {
		if (a.getPierceAmount() >= Math.floor(shieldStrength)) {return;} // if the attack can pierce the shields
		else {
			if (a.canDamageShield())  {
				shieldStrength--;
				a.setAttackFailed(true);
				return;
			}
			else {
				a.reduceDamage((int) Math.floor(shieldStrength));
				return;
			}
		}
	}
}
