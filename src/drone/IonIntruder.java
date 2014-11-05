package drone;

public class IonIntruder extends InteriorDrone {
	public IonIntruder() {
		currentHealth = maxHealth = 125;
		playerShip = false;
		enemyShip = true;
		powerReq = 3;
		cost = 65;
	}
	
	// deals ion damage to systems on enemy ship and stuns crew
}
