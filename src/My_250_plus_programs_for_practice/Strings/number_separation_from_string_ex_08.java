package My_250_plus_programs_for_practice.Strings;

import java.util.Arrays;

public class number_separation_from_string_ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		separate_numbersfrom_string_using_replaceAll();
		separate_numbersfrom_string_using_Split();
	}
	
	public static void separate_numbersfrom_string_using_replaceAll() {
		
		String s = "a1b2c3d4e5";
		
		String number = s.replaceAll("[^0-9]", "");
		
		System.out.println(number);
		
		
	}

public static void separate_numbersfrom_string_using_Split() {
		
		String s = "Jhansi1210998";
		
		String[] alpha = s.split("[0-9]");
		
		String[] numbers = s.split("[a-z]");
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(alpha));

		
	}

}
