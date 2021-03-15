package TaskPackage;

public class NumbersArray {

	public int[] getArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (Math.sqrt(arr[i]) % 1 == 0) {
				arr[i] = (int) Math.sqrt(arr[i]);
			} else {
				arr[i] *= arr[i];
			}
		}

		return arr;
	}

}
