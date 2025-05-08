package April_29042025_Arrays_simplycoding.Arrays_1D;

public class SecondLargest_myApproach_Ex_04 {

	public static void main(String[] args) {

		int[] arr = { 11, 11, 11, 11, 11, 11 };
		int largest = arr[0];
		int secondlargest = arr[0];

		for (int num : arr) {
			if (num > largest) {
				secondlargest = largest;
				largest = num;

			} else if (num > secondlargest && num != largest) {

				secondlargest = num;

			}

		}

		System.out.println("secondlargest of arr : " + secondlargest);

	}


}
