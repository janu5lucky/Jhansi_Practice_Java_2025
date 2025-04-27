package Practice_beaconLi_05042025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaClass_05 {

	public static void main(String[] args) {

		arraylisyt_approach01();
		arraylisyt_approach02();
	}

	public static void arraylisyt_approach01() {

		String[] arr = { "strawberry", "banana", "orange", "apple", "grape" };
		System.out.println("Unsorted array :" + Arrays.toString(arr));

		String[] Sortarr = new String[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].length() > arr[j + 1].length()) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			Sortarr[i] = arr[i];

		}
		System.out.println("Sorted by Length :" + Arrays.toString(Sortarr));
	}
	public static void arraylisyt_approach02() {

		String[] arr = { "apple", "banana", "orange", "strawberry", "grape" };
		String[] Sortarr = new String[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].length() > arr[j + 1].length()) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		for (String n:Sortarr) {
			Sortarr = arr;

		}
		System.out.println("Sorted by Length :" + Arrays.toString(Sortarr));
	}

}
