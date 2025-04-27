package April_270425_Arrays_practice;

import java.util.Arrays;

public class sort_int_array_Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numericarray_sort_ascending();
		numericarray_sort_descending();
			}

	public static void numericarray_sort_ascending() {
		int[] arr = {12,3,4,5,6,7,-1,-2,-3,-4,};
		int l = arr.length;
		//int[] sortarr;
		
		for(int i =0;i<l;i++) {
			for(int j =i+1;j<l;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}System.out.println(Arrays.toString(arr));
		

	}
	public static void numericarray_sort_descending() {
		int[] arr = {12,3,4,5,6,7,-1,-2,-3,-4,};
		int l = arr.length;
		//int[] sortarr;
		
		for(int i =0;i<l;i++) {
			for(int j =i+1;j<l;j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}System.out.println(Arrays.toString(arr));
		

	}
	
}
