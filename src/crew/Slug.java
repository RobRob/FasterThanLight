package crew;

public class Slug extends Crew {
	public Slug() {
		race = RaceEnum.SLUG;
		currentHealth = maxHealth = 100;
		moveSpeed = 1.0;
		raceCombatModifier = 1.0;
		raceRepairModifier = 1.0;
	}
	
	// Can see into adjacent rooms
	
	// Can detect all enemy crew members, on your ship or the enemies
	// Can detect the kind of lifeform and what they are doing
	
	// Immune to mind control
}
