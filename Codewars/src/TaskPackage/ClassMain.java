package TaskPackage;

public class ClassMain {

	public static void main(String[] args) {

		KeepHydrated cycling = new KeepHydrated();
		System.out.println("KeepHydrated");
		System.out.println(cycling.getWater(3));
		System.out.println(cycling.getWater(6.7));
		System.out.println(cycling.getWater(11.8));

		System.out.println("Converter");
		Converter myobj = new Converter();
		System.out.println(myobj.convert(10));

		System.out.println("To square(root) or not to square(root)");
		NumbersArray array = new NumbersArray();
		int[] a = { 4, 3, 9, 7, 2, 1 };
		int[] c = array.getArray(a);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}
}
