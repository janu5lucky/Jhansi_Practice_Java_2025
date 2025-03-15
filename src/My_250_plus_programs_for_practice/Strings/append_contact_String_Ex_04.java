package My_250_plus_programs_for_practice.Strings;

public class append_contact_String_Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		contact_string_using_plus();
		contact_string_using_stringBuilder_append();
		reverse_string_with_StringBuffer();
		reverse_string_with_StringBuilder();
		

	}

	public static void contact_string_using_plus() {
		
		String s1= "Hi ";
		String s2 = "Jhansi";
		String s3 = s1+s2;
		System.out.println("Concatinated array : "+s3);
		
		// Concat with String and append word
		
		String s4 = s3+" Hello";// String builder Approach Appending to existing String 
		System.out.println(s4);
		
		
		
	}
	
public static void contact_string_using_stringBuilder_append() {
		
		String s1= "Hi ";
		String s2 = "Jhansi";
		StringBuilder s3 = new StringBuilder(s1);
		s3.append(s2);
		System.out.println("Concatinated array witrh StringBuilder : "+s3);
		
		// Concat with String and append word
		
		String s4 = s3+", Hello";// String builder Approach Appending to existing String 
		System.out.println(s4);
		
		
		
	}
public static void reverse_string_with_StringBuffer() {
	
	String s1= " Hi ";
	String s2 = "Jhansi";
	StringBuffer s3 = new StringBuffer(s1);
	s3.reverse();
	s3.append(s2);
	System.out.println("Concatinated array witrh StringBuffer and reverse: "+s3);
	
	// Concat with String and append word
	
	String s4 = s3+", Hello";// String builder Approach Appending to existing String 
	System.out.println(s4);
	
}

public static void reverse_string_with_StringBuilder() {
	
	String s1= " Hi ";
	String s2 = "Jhansi";
	StringBuilder s3 = new StringBuilder(s1);
	s3.reverse();
	s3.append(s2);
	System.out.println("Concatinated array witrh StringBuilder and reverse: "+s3);
	
	// Concat with String and append word
	
	String s4 = s3+", Hello";// String builder Approach Appending to existing String 
	System.out.println(s4);
	

}

}
