package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.Arrays;

public class Comparing_arrays_ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] arr1 = {{'a','B'}, {'C','l'}};
		char[][] arr2 = {{'s', 'd','A'},{'K','l'}};
		char[][] arr3 = {{'a','B'}, {'C','l'}};

		System.out.println("Comaprision "+ Arrays.equals(arr1, arr2));
		System.out.println("Comaprision "+ Arrays.deepEquals(arr1, arr3));

		
		

	}

}
