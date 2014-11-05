package weapon;

public class Pegasus extends ProjectileWeapon {
	public Pegasus() {
		name = "Pegasus";
		powerReq = 3;
		cost = 60;
		
		cooldown = 20;
		firingSpeed = 60; // need to test missile firing speeds
		
		piercing = 5;
		fire = 0.3;
		breach = 0.2;
		stun = 0.1;
		
		damagePerShot = 2;
		noOfShots = 2;
		reqMissile = true;
	}
}
