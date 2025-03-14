package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.Arrays;

public class DeepCopy_shallowCopy_arrays_07 {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		shallowCopy_array();
		DeepCopy_Array();
		Types_toCopy_array_1_using_arrayscopy();
		Types_toCopy_array_2_using_arrays_copyof();
		Types_toCopy_array_3_using_clone();		
	}

	public static void shallowCopy_array() {
		// original Array of int 
		int[] original = {1,2,3,4,6,5};
		
		// Shallow copied Array int
		int[] shallowcopy = original;
		
		// Modify the Array value in Shallow int 
		
		shallowcopy[0] = 10;
		// now print both 
		
		System.out.println("Original Array : "+Arrays.toString(original));
		System.out.println("Shallowcopied Array : "+Arrays.toString(shallowcopy));
		// data is modified in Both arrays
		
		
	}
	
	public static void DeepCopy_Array() {
		
		// Original Array 
		int[] original = {1,2,3,4,6,5};
		
		// Declaring new array for deep copy array with length of original array
		int[] deepcopy = new  int[original.length];
		// for loop to copy each value from original to deepcopy one by one 
		for(int i=0; i<original.length;i++) {
			
			deepcopy[i] = original[i];
			
		}
		
		/// modify deepcopy array
		deepcopy[0] = 10 ;
		
		
		System.out.println("Original Array : "+Arrays.toString(original));
		System.out.println("Deep Copied Array : "+Arrays.toString(deepcopy));
		// data is modified in Both arrays
				
	}

public static void Types_toCopy_array_1_using_arrayscopy() {	
	// Original Array 
	int[] source = {1,2,3,4,6,5};
	int[] endarray = new int[source.length];
	
	System.arraycopy(source, 0, endarray, 0, source.length);
	
	
	System.out.println("Original Array : "+Arrays.toString(source));
	System.out.println("Copied Array : "+Arrays.toString(endarray));
	
	endarray[0] = 20;
	System.out.println("Copied Array After data modified  : "+Arrays.toString(endarray));
	System.out.println("Original Array After data modified in Endarray: "+Arrays.toString(source));

	// data is modified in Both arrays

	
}

public static void Types_toCopy_array_2_using_arrays_copyof() {	
	// Original Array 
	int[] source = {1,2,3,4,6,5};
	int[] endarray = Arrays.copyOf(source, source.length);
	

	System.out.println("Original Array : "+Arrays.toString(source));
	System.out.println("Copied Array : "+Arrays.toString(endarray));
	
	endarray[0] = 30;
	System.out.println("Copied Array After data modified  : "+Arrays.toString(endarray));
	System.out.println("Original Array After data modified in Endarray: "+Arrays.toString(source));

	// data is modified in Both arrays
			
}
public static void Types_toCopy_array_3_using_clone() {	
	// Original Array 
	int[] source = {1,2,3,4,6,5};
	int[] endarray = source.clone();
	

	System.out.println("Original Array : "+Arrays.toString(source));
	System.out.println("Copied Array : "+Arrays.toString(endarray));
	
	endarray[0] = 40;
	System.out.println("Copied Array After data modified  : "+Arrays.toString(endarray));
	System.out.println("Original Array After data modified in Endarray: "+Arrays.toString(source));

	// data is modified in Both arrays
			
}

}
