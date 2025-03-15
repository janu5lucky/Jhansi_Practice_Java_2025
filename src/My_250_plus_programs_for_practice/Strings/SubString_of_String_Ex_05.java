package My_250_plus_programs_for_practice.Strings;

import java.util.Arrays;

public class SubString_of_String_Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Halloween";
		
		System.out.println(s.substring(5));
		
		char[] arr = s.toCharArray();
		
		System.out.println("String to array Char[] : "+Arrays.toString(arr));
		
		String newstr = new String(arr);
		
		System.out.println("new String from array : "+newstr);

		
		
	}

}
