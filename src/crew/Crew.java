package crew;

public abstract class Crew {
	
	// INSTANCE VARIABLES
	
	protected String name = "temp";
	protected RaceEnum race;
	protected int currentHealth;
	protected int maxHealth;
	protected double moveSpeed;
	protected double raceCombatModifier;
	protected double raceRepairModifier;
	
	protected int[] currentExperienceArray = {0, 0, 0, 0, 0, 0};
	protected int[] maxExperienceArray = {15, 15, 55, 65, 18, 8};
	protected int[] skillLevel = {0, 0, 0, 0, 0, 0};
	
	protected layout.Square location;
	
	// GET AND SET METHODS
	
	public String getName() {return name;}
	public RaceEnum getRace() {return race;}
	public int getCurrentHealth() {return currentHealth;}
	public void heal(double health) {
		currentHealth += (int) health;
		if (currentHealth > maxHealth) {
			currentHealth = maxHealth;
		}
	}
	public void damage(double damage) {
		currentHealth -= (int) damage;
		if (currentHealth < 0) {
			currentHealth = 0;
		}
	}
	public int getMaxHealth() {return maxHealth;}
	public double getMoveSpeed() {return moveSpeed;}
	public double getRaceCombatModifier() {return raceCombatModifier;}
	public double getRaceRepairModifier() {return raceRepairModifier;}
	public layout.Square getLocation() {return location;}
	
	public void setLocation(layout.Square s) {location = s;}
	
	// OTHER METHODS
	
	public boolean isDead() {
		if (currentHealth<=0) {return true;}
		else {return false;}
	}
	
	// This one does a chain of movements to get to a particular square
	public void moveToSquare(layout.Square destinationSquare) {
		layout.Square currentSquare = location;
		layout.Square nextSquare;
		while (currentSquare != destinationSquare) {
			nextSquare = location.getRoute(destinationSquare);
			System.out.println(nextSquare);
			changeLocation(nextSquare);
			currentSquare = location;
		}
		
	}
	
	// This one does a single movement to get to a particular square - would work, but doesnt allow for time to pass
	public void changeLocation(layout.Square s) {
		location.setCrew(null);
		s.setCrew(this);
		location = s;
	}
}
