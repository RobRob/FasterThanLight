package augmentation;

public class ZoltanShield extends Augmentation {
	public ZoltanShield() {
		buyable = false;
		cost = 80;
	}
	
	// 5 damage shield at start of every fight. Takes twice as much dmg from ion weapons
	// While it holds, prevents boarding, mind control, hacking
}
