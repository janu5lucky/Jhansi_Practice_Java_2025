package My_250_plus_programs_for_practice.Strings;

import java.util.Scanner;

public class Reverse_String_and_palidrome_Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(string_is_palindrome("madam")) ;
		string_is_palindrome2("chachach") ;
		string_is_palindrome3_withLoop();
		string_is_palindrome3_withwhileLoop();
		
		
	}

	public static boolean string_is_palindrome(String Str) {
		
		String rev = new StringBuilder(Str).reverse().toString();
		
		return Str.equals(rev);
		
	}
	
	public static void string_is_palindrome2(String Str) {
		
		String rev = new StringBuilder(Str).reverse().toString();
		
		//return Str.equals(rev);
		
		boolean results = Str.equals(rev);
		System.out.println(results);
}

	public static void string_is_palindrome3_withLoop() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int len = str.length();
		
		String rev=""  ;
		
		for (int i = len-1; i>=0; i-- ) {
			
		 rev = rev+str.charAt(i);
					
		}
		
		System.out.println("String : "+str);
		System.out.println("Reverse String : "+rev);

		if (str.equals(rev)) {
			System.out.println("String is Palindrome");

		}else {
			System.out.println("String is not Palindrome");

		}
		
}

public static void string_is_palindrome3_withwhileLoop() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int len = str.length();
		int i = len-1;
		String rev=""  ;
		
		while (i>=0){
			
		 rev = rev+str.charAt(i);
			i--;		
		}
		
		System.out.println("String : "+str);
		System.out.println("Reverse String : "+rev);

		if (str.equals(rev)) {
			System.out.println("String is Palindrome");

		}else {
			System.out.println("String is not Palindrome");

		}
		
}

	
	
}