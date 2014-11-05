package crew;

public class Mantis extends Crew {
	public Mantis() {
		race = RaceEnum.MANTIS;
		currentHealth = maxHealth = 100;
		moveSpeed = 1.2;
		raceCombatModifier = 1.5;
		raceRepairModifier = 0.5;
	}
	
}
