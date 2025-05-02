package April_270425_Arrays_practice;

public class Largest_smallest_inArrayNums_ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 34, 455, 988, 22, 12, 333, 44, 555 };
		int l = arr.length;
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < l; i++) {
				if (max < arr[i]) {

					max = arr[i];
				}
				if (min > arr[i]) {

					min = arr[i];
				}

			}

		System.out.println("min in array : "+min);
		System.out.println("Max in array : "+max);

	}

}
