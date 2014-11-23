package system;

import java.util.*;

public class Weapons extends MainSystem {
	
	protected ArrayList<InstalledWeapon> weapons = new ArrayList<InstalledWeapon>();
	protected int maxWeapons;
	private double chargeSpeed = 1.0;
	
	public Weapons(int startPow, int startCap, weapon.Weapon[] startWeapons, int maxWeapons, ship.Ship ship) {
		super(startPow, startCap, ship);
		name = "Weapons";
		type = SystemEnum.WEAPONS;
		mannedBonus = true;
		maxCapacity = 8;
		
		
		for (weapon.Weapon w : startWeapons) {weapons.add(new InstalledWeapon(w));}
		this.maxWeapons = maxWeapons;
	}
	// GET AND SET METHODS
	public ArrayList<InstalledWeapon> getWeapons() {return weapons;}
	
	public void update(double time) {
		
	}
	

	
	
	
	
	// PRIVATE CLASS FOR WEAPONS THAT ARE INSTALLED (AND THEREFORE HAVE COOLDOWNS, ETC.)
	
	public class InstalledWeapon extends weapon.Weapon {
		
		private weapon.Weapon weaponType;
		private boolean isPowered = false;
		private double currentCooldown;
		
		private InstalledWeapon(weapon.Weapon w) {
			weaponType = w;
		}
		
		public void setPower(boolean b) {isPowered = b;}
		public boolean isPowered() {return isPowered;}
		
		public void updateWeapon(double time) {
			currentCooldown -= time;
			if (currentCooldown <= 0) {
				currentCooldown = 0;
			}
		}
		
		public void resetCooldown() {
			currentCooldown = weaponType.getCooldown();
		}
		
		public boolean canFire() {
			if (currentCooldown == 0) {return true;}
			else {return false;}
		}
	}
}
