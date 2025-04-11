package My_250_plus_programs_for_practice.Collections;

import java.util.Arrays;
import java.util.TreeSet;

public class SecondLarget_value_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		find_second_larger_inArray_treeset();
		find_second_larger_inArray_approach2();	
	}

	
	public static void find_second_larger_inArray_treeset() {
		
		int[] arr = {1,2,3,4,6,7,8,9};
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int n :arr) {
			
			set.add(n);
			
		}
		set.pollLast();
		System.out.println("2nd Largest element : "+set.last());
		
	}

public static void find_second_larger_inArray_approach2() {
		
		int[] arr = {1,2,3,4,6,7,8,9};
		
	//	int[] sortarr = 
				Arrays.sort(arr);
		
		System.out.println("2nd Largest number :"+arr[arr.length-2]);
	}




}
