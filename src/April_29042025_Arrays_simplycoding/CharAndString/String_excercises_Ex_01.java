package April_29042025_Arrays_simplycoding.CharAndString;

import java.util.Arrays;

public class String_excercises_Ex_01 {

	public static void main(String[] args) {
  
	//	String_Instanciation_or_Declaration();
	//	String_interviw_output();
	//	Conversion_string_to_Wrapper();
	//	Conversion_string_to_primitive();
		Conversion_primitive_to_string();
	}
public static void String_Instanciation_or_Declaration() {
	
	String str = new String();
	str = "hellow";
	System.out.println("String str = new String(); : "+str);
	String str1 = new String("happy");

	System.out.println("String str1 = new String(\"happy\"); "+str1);
	
	char[] h2 = {'g','o','o','d'};
	String str2 = new String(h2);
	System.out.println("char[] h2 = {'g','o','o','d'};\r\n"
			+ "	String str2 = new String(h2); "+str2);
	
	String str4 = "Smart";
	System.out.println("String str4 = \"Smart\"; "+str4);
	
	/// invalid declaration
	char[] h3 = {'s','u','p','e','r'};
	String str3 = h3.toString();

	System.out.println("char[] h3 = {'s','u','p','e','r'};\r\n"
			+ "	String str3 = h3.toString();"+Arrays.toString(h3));

	
}
public static void String_interviw_output() {
	
	String s1 = "Simply", s2 ="coding";

	String s3 = s1.concat(s2);
	System.out.println(s1);
	//  output is Simply
	System.out.println(s2);
	//  output is coding
	System.out.println(s3);
	// output is - Simplycoding
	
}
public static void Conversion_string_to_Wrapper() {
	
	// Wrapper classes to String class
	
	String s = "100";
	//String s2 = "1234200l";
	System.out.println("Convert String to Wrapper class");

	Integer num = Integer.valueOf(s);
	System.out.println("String to Ineteger: "+s);
	
	Long l= Long.valueOf(s);
	System.out.println("String to Long: " +l);

	Float f = Float.valueOf(s);
	System.out.println("String to Float: " +f);
	
	Double d = Double.valueOf(s);
	System.out.println("String to Double: " +d);
	
}	
public static void Conversion_string_to_primitive() {
	
	// Wrapper classes to String class
	
	String s = "100";
	//String s2 = "1234200l";
	System.out.println("Convert String to primitive datatype");

	int num = Integer.parseInt(s);
	System.out.println("String to Ineteger: "+s);
	
	long l= Long.parseLong(s);
	System.out.println("String to Long: " +l);

	float f = Float.valueOf(s);
	System.out.println("String to Float: " +f);
	
	float f2 = Float.parseFloat(s);
	System.out.println("String to Float: " +f);
	
	
	double d = Double.parseDouble(s);
	System.out.println("String to Double: " +d);
	
}	
public static void Conversion_primitive_to_string() {
	
	// Wrapper classes to String class
	
	int n =100;
	long l = 10068761212l;
	double d = 323.4232;
	float f = 323.3232f;
	
	//String s2 = "1234200l";
	System.out.println("Convert primitive datatype to String ");

	String s1 = String.valueOf(n);
	System.out.println("Int to String: "+s1);
	
	String s2= String.valueOf(l);
	System.out.println("Long to String: " +s2);

	String s3 = String.valueOf(f);
	System.out.println("Float to String: " +s3);
	
	String s4 = String.valueOf(d);
	System.out.println("Double to String: " +s4);
	
}	


}
