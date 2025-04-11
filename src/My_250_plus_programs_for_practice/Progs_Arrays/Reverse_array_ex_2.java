package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_array_ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_array_withSorting();
		
		//Reverse_array_using_sameArray_gvreddy_solution();
		reverse_solution2_by_gemini();
	}
	
	public static void reverse_array_withSorting() {
		int[] str = {23,2,4,67,12,5,9};
		System.out.println("Without Sorted Array : "+Arrays.toString(str));

		Arrays.sort(str);
		System.out.println("Sorted Array : "+Arrays.toString(str));
		//int[] reverseint  = Arrays.sort(str, Collections.reverseOrder());
			//	//sort(str,Collections.reverseOrder());
		//  = Collections.reverse(str);
		Integer[] integerArray = Arrays.stream(str).boxed().toArray(Integer[]::new);
		Arrays.sort(integerArray, Collections.reverseOrder());
		
		//System.out.println("Sorted Ascending numbers : "+str);
		System.out.println("Sorted Descending numbers : "+Arrays.toString(integerArray));

		
		
		
	}

	public static void reverse_array_by_Gemini() {
		int[] str = {23, 2, 4, 67, 12, 5, 9};

        // Convert int[] to Integer[]
        Integer[] integerArray = Arrays.stream(str).boxed().toArray(Integer[]::new);

        // Sort in reverse order
        Arrays.sort(integerArray, Collections.reverseOrder());

        System.out.println("Reverse Sorted Array: " + Arrays.toString(integerArray));

        // If you need to convert back to int[]:
        int[] reversedIntArray = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
        System.out.println("Reverse Sorted int[]: " + Arrays.toString(reversedIntArray));
    
	}
	
	public static void reverse_solution2_by_gemini(){
		
		int[] str = {23, 2, 4, 67, 12, 5, 9};
        Arrays.sort(str); // Sort the original array in ascending order

        System.out.print("Reverse Sorted Array: ");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " "); // Print elements in reverse order
        }
        System.out.println();
	}

public static void Reverse_array_using_sameArray_gvreddy_solution(){
		
		int[] arr = {23, 2, 4, 67, 12, 5, 9};
		int i =0;
		int j =arr.length-1;
		
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
		}
        System.out.print("Reverse Sorted Array: "+Arrays.toString(arr));
}
}
