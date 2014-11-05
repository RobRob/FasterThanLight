package weapon;

public class BurstLaserII extends ProjectileWeapon {
	public BurstLaserII() {
		name = "Burst Laser II";
		powerReq = 2;
		cost = 80;
		
		cooldown = 12.0;
		firingSpeed = 60;
		
		fire = 0.1;
		
		damagePerShot = 1;
		noOfShots = 3;
	}
}
