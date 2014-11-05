package drone;

public class BoardingDrone extends InteriorDrone {
	public BoardingDrone() {
		currentHealth = maxHealth = 150;
		playerShip = false;
		enemyShip = true;
		powerReq = 3;
		cost = 70;
	}
	
	// attacks crewmen on the enemy ship
}
