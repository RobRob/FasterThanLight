package weapon;

public class Hermes extends ProjectileWeapon {
	public Hermes() {
		name = "Hermes";
		powerReq = 3;
		cost = 45;
		
		cooldown = 14;
		firingSpeed = 60; // need to test missile firing speeds
		
		piercing = 5;
		fire = 0.3;
		breach = 0.2;
		stun = 0.1;
		
		damagePerShot = 3;
		reqMissile = true;
	}
}
