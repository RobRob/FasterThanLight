package weapon;

public class Breach extends ProjectileWeapon {
	public Breach() {
		name = "Breach";
		powerReq = 3;
		cost = 65;
		
		cooldown = 22;
		firingSpeed = 60; // need to test missile firing speeds
		
		piercing = 5;
		fire = 0.3;
		breach = 0.8;
		stun = 0.1;
		
		damagePerShot = 4;
		reqMissile = true;
	}
}
