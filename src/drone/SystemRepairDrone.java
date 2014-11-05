package drone;

public class SystemRepairDrone extends InteriorDrone {
	public SystemRepairDrone() {
		currentHealth = maxHealth = 75; // 75 is a guess
		playerShip = true;
		enemyShip = false;
		powerReq = 1;
		cost = 30;
	}
	
	// repairs your ship
}
