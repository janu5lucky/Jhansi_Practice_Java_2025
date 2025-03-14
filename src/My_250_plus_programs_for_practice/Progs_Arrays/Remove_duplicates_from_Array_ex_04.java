package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Remove_duplicates_from_Array_ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Remove_duplicate_from_aaray_approach01();

	}

	public static void Remove_duplicate_from_aaray_approach01() {
		
		int[] arr = {2,3,4,5,6,7,3,4,5};
		
		Set <Integer> unique = new HashSet<>();
		
		for(int num:arr) {
			unique.add(num);
			
		}
		System.out.println(unique);
		
	}
	
}
