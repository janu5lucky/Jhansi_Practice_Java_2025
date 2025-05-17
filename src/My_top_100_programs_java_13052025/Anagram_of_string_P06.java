package My_top_100_programs_java_13052025;

import java.util.Arrays;

public class Anagram_of_string_P06 {

	public static void main(String[] args) {

	String s= "carrace";
	String a = "racecar";
	System.out.println(Anagram_boolean_of_string(s,a));
	
		
	}
public static boolean Anagram_boolean_of_string(String s , String a) {
	
	char[] ch1 = s.toCharArray();
	char[] ch2 = a.toCharArray();
	System.out.println("String a Array :"+Arrays.toString(ch1));
	System.out.println("String a Array :"+Arrays.toString(ch2));
//	String s1 = 
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	System.out.println("String a sorted Array :"+Arrays.toString(ch1));
	System.out.println("String a sorted Array :"+Arrays.toString(ch2));
	String s1 = String.copyValueOf(ch1);
	String s2 = String.copyValueOf(ch2);
	System.out.println("String1 sorted  :"+s1);
	System.out.println("String2 sorted :"+s2);
	if(s1.equals(s2)) {
System.out.println("given Strings are Anagram");		
		return true;

	}else {
		System.out.println("given Strings are not Anagram");		
		return false;
	}
}
}
