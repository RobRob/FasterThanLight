package augmentation;

public abstract class Augmentation {
	protected boolean buyable = true; // default is buyable
	protected int cost;
	
	public boolean isBuyable() {return buyable;}
	
	public int getBuyPrice() {
		return cost;
	}
	public int getSalePrice() {
		return (int) Math.floor(cost/2);
	}
	
	// ability
	
	
	
}
