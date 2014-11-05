 package drone;

public class AntiPersonnelDrone extends InteriorDrone {
	public AntiPersonnelDrone() {
		currentHealth = maxHealth = 150;
		playerShip = true;
		enemyShip = false;
		powerReq = 2;
		cost = 60;
	}
	
	// kills enemies on your ship. Fireproof
}
