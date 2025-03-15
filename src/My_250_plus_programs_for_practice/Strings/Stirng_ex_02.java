package My_250_plus_programs_for_practice.Strings;

import java.util.Arrays;

public class Stirng_ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Creating_string_type1();
		Creating_string_type2();
		Creating_string_type3();
	}

	public static void Creating_string_type1() {
		
		String s1= "Hello World";
		
		System.out.println("Creating String with Variable which is stored in String Constant pool : "+s1);
		
		
	}
	
public static void Creating_string_type2() {
		
		String s1= new String("Hello World");
		
		System.out.println("Creating String with creating a object whose reference is stored in heap area : "+s1);
		
		
	}
public static void Creating_string_type3() {
	
	
	char[] chars = {'H', 'e', 'l','l','o'};
	
	String s1= Arrays.toString(chars);
	String s2 = new String(chars);
	
	System.out.println("Creating Char array with variable created in Char the convert to String using Arrays.toString() : "+s1);
	System.out.println("Creating Char array with variable created in Char the convert to String using new object for String()  "+s2);
	// s1 creates the Char Array
	// s2 Creates the String 
	
	
}
	
}
