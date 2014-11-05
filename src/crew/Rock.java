package crew;

public class Rock extends Crew {
	public Rock() {
		race = RaceEnum.ROCK;
		currentHealth = maxHealth = 150;
		moveSpeed = 0.5;
		raceCombatModifier = 1.0;
		raceRepairModifier = 1.0;
	}
	
	// Immune to fire
}
