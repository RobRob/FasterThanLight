package system;

public class ArtilleryBeam extends MainSystem {
	public ArtilleryBeam(int startPow, int startCap) {
		super(startPow, startCap);
		name = "Artillery Beam";
		type = SystemEnum.ARTILLERY_BEAM;
		mannedBonus = false;
		maxCapacity = 4;
	}
}
