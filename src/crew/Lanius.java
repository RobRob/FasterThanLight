package crew;

public class Lanius extends Crew {
	public Lanius() {
		race = RaceEnum.LANIUS;
		currentHealth = maxHealth = 100;
		moveSpeed = 0.8;
		raceCombatModifier = 1.0;
		raceRepairModifier = 1.0;
	}
	
	// Drains oxygen from current room
	
	// Immune to suffocation damage
}
