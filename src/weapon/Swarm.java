package weapon;

public class Swarm extends ProjectileWeapon {
	public Swarm() {
		name = "Swarm";
		powerReq = 2;
		cost = 65;
		
		cooldown = 7; // 7-21 seconds based on charge
		firingSpeed = 60; // need to test missile firing speeds
		
		piercing = 5;
		fire = 0.1;
		breach = 0.1;
		stun = 0.1;
		
		damagePerShot = 1;
		noOfShots = 3; // 1-3 shots based on charge
		reqMissile = true;
	}
}
