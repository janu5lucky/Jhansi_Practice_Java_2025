package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Arrays_Ex_practice_02 {

	public static void main(String[] args) {

		int[] arr = {87,90,22,34,56,12,87};
		System.out.println("Without Sorting :"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("Ascending : "+Arrays.toString(arr));
		
		Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(integerArray, Collections.reverseOrder());
		System.out.println("Descending Order "+Arrays.toString(integerArray));
		
	}

}
