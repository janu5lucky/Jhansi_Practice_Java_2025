package My_250_plus_programs_for_practice.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removesuplicates_in_AnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	remove_duplicate_String_In_Array_approach1();
	//	remove_duplicate_String_In_Array_approach2();
	//	remove_duplicate_String_In_Array_approach3();
		
		//remove_duplicate_Int_In_Array_approach1();
	//	remove_duplicate_Int_In_ArrayList_approach2();
		//remove_duplicate_String_In_ArrayList_approach4();
		remove_duplicate_String_In_ArrayList_approach5();
		
		
	}

	public static void remove_duplicate_String_In_Array_approach1() {

		String[] arr = { "apple", "Banana", "apple", "orange", "kiwi", "kiwi" };
		Set<String> unique = new LinkedHashSet<>();
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			unique.add(arr[i]);

		}

		System.out.println(unique);

	}

	public static void remove_duplicate_String_In_Array_approach2() {

		String[] arr = { "apple", "Banana", "apple", "orange", "kiwi", "Kiwi", "banana", "Oranges" };
		Set<String> unique = new LinkedHashSet<>();
		int n = arr.length;

		for (String str : arr) {
			String strlower = str.toLowerCase();
			unique.add(strlower);

		}

		System.out.println(unique);

	}

	public static void remove_duplicate_String_In_Array_approach3() {

		String[] arr = { "apple", "Banana", "apple", "orange", "kiwi", "Kiwi", "banana", "Oranges" };
		Set<String> unique = new LinkedHashSet<>();
		int n = arr.length;

		for (String str : arr) {
			unique.add(str.toLowerCase());

		}

		System.out.println(unique);

	}
	public static void remove_duplicate_Int_In_Array_approach1() {

		int[] numberarr = { 1,2,3,4,5,6,2,4,1 };
		Set<Integer> unique = new HashSet<>();

		for (Integer num : numberarr) {
			unique.add(num);

		}

		System.out.println(unique);

	}
	
	public static void remove_duplicate_Int_In_ArrayList_approach2() {

		ArrayList<Integer> numberarr =  new ArrayList<>();
		
		numberarr.add(7);
		numberarr.add(1);
		numberarr.add(3);
		numberarr.add(4);
		numberarr.add(5);
		numberarr.add(3);
		numberarr.add(6);
		numberarr.add(7);
		numberarr.add(8);
		numberarr.add(2);
		
		
		Set<Integer> unique = new HashSet<>();

		for (Integer num : numberarr) {
			unique.add(num);

		}

		System.out.println(unique);

	}

	public static void remove_duplicate_String_In_ArrayList_approach4() {

		ArrayList<String> straarr =  new ArrayList<>();
		
		straarr.add("Kiwi");
		straarr.add("Orange");
		straarr.add("banana");
		straarr.add("Banana");
		straarr.add("apple");
		straarr.add("Apple");
		straarr.add("mango");
		straarr.add("grapes");
		straarr.add("Grapes");
		straarr.add("strawberry");
		
		
		Set<String> unique = new LinkedHashSet<>();

		for (String arr : straarr) {
			unique.add(arr.toLowerCase());

		}

		System.out.println(unique);

	}

	public static void remove_duplicate_String_In_ArrayList_approach5() {

		ArrayList<String> straarr =  new ArrayList<>();
		
		straarr.add("Kiwi");
		straarr.add("Orange");
		straarr.add("banana");
		straarr.add("banana");
		straarr.add("apple");
		straarr.add("apple");
		straarr.add("mango");
		straarr.add("grapes");
		straarr.add("grapes");
		straarr.add("strawberry");
		
		System.out.println(straarr);
		
		Set<String> unique = new LinkedHashSet<>(straarr);
		straarr.clear();
		unique.addAll(straarr);
	

		System.out.println("after duplicate removed"+unique);

	}



	
}
