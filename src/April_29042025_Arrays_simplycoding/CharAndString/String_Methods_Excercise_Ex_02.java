package April_29042025_Arrays_simplycoding.CharAndString;

public class String_Methods_Excercise_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String_Methods_Check();
	//	String_Methods_Positions();
	//	String_Methods_Manipulative();
	//	String_Methods_Char();
		
	//	String_Methods_Check_withBooleans();
	//	String_output_guess_interviewQ1();
		String_output_guess_interview_index_Q2();
		String_output_guess_interview_getChatAt_index_Q3();
		
	}

	public static void String_Methods_Check() {
		
		System.out.println("String Methods to Check");

		String s = "Hello hi";
		if(s.contains("h")) {
			System.out.println("contains() Method : "+true);
		}
		
		String s1 = "Hello";
		if(s1.equals("Hello")) {
			System.out.println("equals() Method : "+true);
		}
		
		String s2 = "Hello";
		if(s2.equalsIgnoreCase("hello")) {
			System.out.println("equalsIgnoreCase() Method : "+true);
		}
		String s3 = "Hello";
		if(s3.startsWith("he")) {
			System.out.println("Starts With () Method : "+true);
		}
		
		String s4 = "Hello";
		if(s4.endsWith("o")) {
			System.out.println("Ends With () Method : "+true);
		}
		
	}
public static void String_Methods_Check_withBooleans() {
		
		System.out.println("String Methods to Check With Booleans");

		String s = "hello Hi w";
		boolean b = s.contains(" w");
		System.out.println("Booelan b for contains :"+b);
		String s1 = "Hello";
		boolean b1 = s1.equals("Hello");
		System.out.println("equals() Method : "+b1);
		b1 = s1.equals("hello");
		System.out.println("equals() Method :(false five lowercase) "+b1);

				
		String s2 = "Hello";
		boolean b2 = s2.equalsIgnoreCase("hello");
		System.out.println("equalsIgnoreCase() Method : "+b2);
		
		String s3 = "Hello";
		boolean b3 = s3.startsWith("he");
		System.out.println("Starts With () Method :(False given small to compare) "+b3);
		
		String s4 = "Hello";
		boolean b4 = s4.endsWith("o");
		System.out.println("Ends With () Method : "+b4);
				
	}

	
	
public static void String_Methods_Positions() {
		
		System.out.println("String Methods for Positions");

		String s = "Hello hi";
		String s1 = "hi";

		System.out.println("length of String : "+s.length());
		System.out.println("Indexof of String : "+s.indexOf(s, 'h'));
		System.out.println("last Indexof of String : "+s.lastIndexOf(s));
		System.out.println("Compared To of String : "+s1.compareTo("Hi"));
		System.out.println("Compared To Ignore case of String : "+s1.compareToIgnoreCase("He"));

	}
public static void String_Methods_Manipulative() {
	
	System.out.println("String Methods for Manipulation");

	String s = "Hello hi";
	String s1 = "hi - ";
	String s3 = s1.concat(s);
	String t=" hi hello ";
	String t2 = t.trim();
	String t3 = t.toUpperCase();
	String t4 = t3.toLowerCase();
	String r = s.replace('l', 'u');
	String sub = s.substring(6);
	
	System.out.println("concat(): "+s3 );
	System.out.println("Trim():"+t2);
	System.out.println("ToUpperCase() : "+t3);
	System.out.println("ToLowerCase(): "+t4);
	System.out.println("Replace() : "+r);
	System.out.println("SubString() : "+sub);
	System.out.println("end : "+s);
	
}
public static void String_Methods_Char() {
	
	System.out.println("String Methods for Char");

	String s = "Hello hi";
	String s1 = "hi - ";
	char ch = s.charAt(0);
	System.out.println("CharAt(): "+ch );

	
}
public static void String_output_guess_interviewQ1() {
	
	System.out.println("String guess output interview Question1");

	String s = "replace";
	s.toUpperCase();
	System.out.println("after ToUpperCase "+s );
// no data is saved as data should be stored in new string or updated to old String 
	s = s.toUpperCase();
	System.out.println("after modifying to ToUpperCase "+s );
// now old string is updated to uppercase
		
}
public static void String_output_guess_interview_index_Q2() {
	
	System.out.println("String guess output based on index interview Question2");

	String s = "hello";
	char c = s.charAt(1);
	System.out.println("Char at index 1 "+c );
String s1 = s.substring(2,5);
System.out.println("Substring after index 2 to 5 at index 1 "+s1);

		
}
public static void String_output_guess_interview_getChatAt_index_Q3() {
	
	System.out.println("String guess output based on index interview Question3");

	String s = "hello";
	char c = s.charAt(1);
	System.out.println("Char at index 1 "+c );

		
}
}
