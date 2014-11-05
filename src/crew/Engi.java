package crew;

public class Engi extends Crew {
	public Engi() {
		race = RaceEnum.ENGI;
		currentHealth = maxHealth = 100;
		moveSpeed = 1.0;
		raceCombatModifier = 0.5;
		raceRepairModifier = 2.0;
	}
}
