package system;

import java.util.*;

public class Weapons extends MainSystem {
	
	protected ArrayList<weapon.Weapon> weapons = new ArrayList<weapon.Weapon>();
	protected int maxWeapons;
	
	public Weapons(int startPow, int startCap, weapon.Weapon[] startWeapons, int maxWeapons) {
		super(startPow, startCap);
		name = "Weapons";
		type = SystemEnum.WEAPONS;
		mannedBonus = true;
		maxCapacity = 8;
		
		for (weapon.Weapon w : startWeapons) {weapons.add(w);}
		this.maxWeapons = maxWeapons;
	}
	
	public ArrayList<weapon.Weapon> getWeapons() {
		return weapons;
	}
}
