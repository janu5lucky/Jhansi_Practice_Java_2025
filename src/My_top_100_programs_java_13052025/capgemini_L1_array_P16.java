package My_top_100_programs_java_13052025;

import java.util.Arrays;

public class capgemini_L1_array_P16 {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		third_array_from_1_2Array(arr1,arr2);
		
	}
	
	public static void third_array_from_1_2Array(int[] arr1, int[] arr2) {
		
		String[] arr3 = new String[arr1.length];
		for(int i =0;i<arr1.length;i++) {
				arr3[i] = String.valueOf(arr1[i])+"+"+String.valueOf(arr2[2-i]);
				
			}
	System.out.println("3rd Array : "+Arrays.toString(arr3));		
	}
	

}
