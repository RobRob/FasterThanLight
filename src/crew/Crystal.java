package crew;

public class Crystal extends Crew {
	public Crystal() {
		race = RaceEnum.CRYSTAL;
		currentHealth = maxHealth = 125;
		moveSpeed = 0.8;
		raceCombatModifier = 1.0;
		raceRepairModifier = 1.0;
	}
	
	// -50% Suffocation Damage
	
	// Power to lock down a room
}
