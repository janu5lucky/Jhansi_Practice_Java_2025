package  April_29042025_Arrays_simplycoding.Arrays_1D;

import java.util.Arrays;

public class Arrays_1D_programs_Ex_01 {

	public static void main(String[] args) {
		program1_sortAnArray_ascending();
		program2_sortAnArray_descending();
	
	}
	
	static void program1_sortAnArray_ascending() {
		
		int[] arr = {2,3,5,6,1,4};
		int l = arr.length;
		System.out.println("original Array : "+Arrays.toString(arr) );
		for(int i=0;i<l;i++) {
			for(int j =i+1;j<l;j++)
			if(arr[j]<arr[i]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			
		}System.out.println("Array Acsending Order: "+Arrays.toString(arr));
		
	}
static void program2_sortAnArray_descending() {
		
		int[] arr = {2,3,5,6,1,4};
		int l = arr.length;
		System.out.println("original Array : "+Arrays.toString(arr) );
		for(int i=0;i<l;i++) {
			for(int j =i+1;j<l;j++)
			if(arr[j]>arr[i]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			
		}System.out.println("Array Acsending Order: "+Arrays.toString(arr));
		
	}
	
}
