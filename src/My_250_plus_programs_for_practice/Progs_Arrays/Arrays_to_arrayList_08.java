package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.Arrays;
import java.util.List;

public class Arrays_to_arrayList_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {14,22,3,54,5};
		
		List<Integer> arraylist = Arrays.asList(arr);
		Arrays.sort(arr);
		System.out.println("Arrays List :"+arraylist);
		
		String[] arr1 = {"Home","car","Room","Light","food","clothes"};
		List<String> arrayintlist= Arrays.asList(arr1);
		
		System.out.println("String Array List : "+arrayintlist);

		
		
	}

}
