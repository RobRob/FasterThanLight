package weapon;

public class Leto extends ProjectileWeapon {
	public Leto() {
		name = "Leto";
		powerReq = 1;
		cost = 20;
		
		cooldown = 9;
		firingSpeed = 60; // need to test missile firing speeds
		
		piercing = 5;
		fire = 0.1;
		breach = 0.1;
		stun = 0.1;
		
		damagePerShot = 1;
		reqMissile = true;
	}
}
