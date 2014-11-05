package crew;

public class Human extends Crew {
	int[] humanExpArray = {13, 13, 50, 58, 16, 7};
	
	public Human() {
		race = RaceEnum.HUMAN;
		currentHealth = maxHealth = 100;
		moveSpeed = 1.0;
		raceCombatModifier = 1.0;
		raceRepairModifier = 1.0;
		
		// Humans gain experience slightly faster
		maxExperienceArray = humanExpArray;
	}
}
