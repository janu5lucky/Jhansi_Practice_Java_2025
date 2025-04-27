package april_240425_practice;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortAnIntegerArray_approach1();
		SortAnIntegerArray_reverse();
		SortStringArray_by_length();
	}

	public static void SortAnIntegerArray_approach1() {
		int[] arr = { 90, -2, -3, -4, 20, 38, 11, 23, 86, 99 };
		int l = arr.length;
		//int[] sorarr = new int[l];
		int temp = 0;

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++)
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
		}

		System.out.println(Arrays.toString(arr));

	}

	public static void SortAnIntegerArray_reverse() {
		int[] arr = { 90, -2, -3, -4, 20, 38, 11, 23, 86, 99 };
		int l = arr.length;
		//int[] sorarr = new int[l];
		int temp = 0;

		for (int i = 0; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++)
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
		}

		System.out.println(Arrays.toString(arr));

	}
	
	public static void SortStringArray_by_length() {
		String[] arr = { "suma","karthik","sabastein","kiran","Suriya","ajit" };
		int l = arr.length;
		//int[] sorarr = new int[l];
		String temp = "";

		for (int i = 0; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++)
				if (arr[j].length() < arr[i].length()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
		}

		System.out.println(Arrays.toString(arr));

	}
	
	public static void ReverseSortStringArray_by_length() {
		String[] arr = { "suma","karthik","sabastein","kiran","Suriya","ajit" };
		int l = arr.length;
		//int[] sorarr = new int[l];
		String temp = "";

		for (int i = 0; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++)
				if (arr[j].length() > arr[i].length()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
		}

		System.out.println(Arrays.toString(arr));

	}

}
