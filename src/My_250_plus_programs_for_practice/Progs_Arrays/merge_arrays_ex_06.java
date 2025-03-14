package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.Arrays;

public class merge_arrays_ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {2,4,6,8,10};
		int[] arr2 = {1,3,5,7,9};
		
		int[] mergedarr = new int[arr1.length+arr2.length];// Array size declaration
		System.arraycopy(arr1, 0, mergedarr, 0, arr1.length);
		System.arraycopy(arr2, 0, mergedarr, arr1.length, arr2.length);
		Arrays.sort(mergedarr);
		System.out.println("Merged arrays : "+Arrays.toString(mergedarr));
		
		
	}

}
