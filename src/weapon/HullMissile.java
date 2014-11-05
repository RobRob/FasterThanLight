package weapon;

public class HullMissile extends ProjectileWeapon {
	public HullMissile() {
		name = "Hull Missile";
		powerReq = 2;
		cost = 65;
		
		cooldown = 17;
		firingSpeed = 60; // need to test missile firing speeds
		
		piercing = 5;
		fire = 0.1;
		breach = 0.3;
		stun = 0.1;
		
		damagePerShot = 2;
		reqMissile = true;
	}
	
	// double damage on systemless rooms
}
