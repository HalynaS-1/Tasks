package TaskPackage;

public class KeepHydrated {

	public int getWater(double t) {
		double lit = Math.floor(t * 0.5);
		return (int) lit;
	}
}
