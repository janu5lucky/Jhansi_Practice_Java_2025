package My_top_100_programs_java_13052025;

import java.util.ArrayList;
import java.util.List;

public class Even_and_odd_int_array_P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,3,4,5,6,7,8,9,10,11,13,15};
		Even_odd_array_aproach1(arr);
		Even_odd_array_aproach2(arr);
		
	}

	public static void Even_odd_array_aproach1(int[] arr) {
		
		int l = arr.length;
		List<Integer> evenarr = new ArrayList<>();
		List<Integer> oddarr = new ArrayList<>();

		for(int i =0; i<l;i++) {
			
			if(arr[i]%2==0) {
				evenarr.add(arr[i]);
				
			}else {
				oddarr.add(arr[i]);
			}
			
		}System.out.println("Even number :"+evenarr);
		System.out.println("Odd number :"+oddarr);
	}
public static void Even_odd_array_aproach2(int[] arr) {
		
		int l = arr.length;
		List<Integer> evenarr = new ArrayList<>();
		List<Integer> oddarr = new ArrayList<>();

		for(int num : arr) {
			
			if(num%2==0) {
				evenarr.add(num);
				
			}else {
				oddarr.add(num);
			}
			
		}System.out.println("Even number :"+evenarr);
		System.out.println("Odd number :"+oddarr);
	}
	
}
