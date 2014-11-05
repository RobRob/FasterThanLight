package weapon;

public class Artemis extends ProjectileWeapon {
	public Artemis() {
		name = "Artemis";
		powerReq = 1;
		cost = 38;
		
		cooldown = 11;
		firingSpeed = 60; // need to test missile firing speeds
		
		piercing = 5;
		fire = 0.1;
		breach = 0.1;
		stun = 0.1;
		
		damagePerShot = 2;
		reqMissile = true;
	}
}
