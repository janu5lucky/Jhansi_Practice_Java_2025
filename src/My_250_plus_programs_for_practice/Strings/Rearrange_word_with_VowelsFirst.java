package My_250_plus_programs_for_practice.Strings;

import java.util.Arrays;

public class Rearrange_word_with_VowelsFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rearrange_word_with_VowelsFirst();
		
	}
	////https://www.countryfinancial.com/
	public static void Rearrange_word_with_VowelsFirst(){
		
		String name = "Hi! Jhansi This is - good 843294";
		String name2 = name.toLowerCase().replaceAll("[^a-z]", "");
		String numbers = name.toLowerCase().replaceAll("[^0-9]", "");

		System.out.println(name2);
		System.out.println(numbers);


		int len = name2.length();
		String vowels = "" ;
		String Consonants = "";
		String vowels2 = "";

		for (int i=0;i<len;i++) {
			char c = name2.charAt(i);
			if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u')
			{
				
				vowels = vowels+c;
				
			}else {
				
				Consonants = Consonants+c;
			}
			
			
		}
		
		char[] v = vowels.toCharArray();
		System.out.println(Arrays.toString(v));
		int len2 = v.length;
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));

		for(int j= 0;j<len2;j++ ) {
		vowels2 = vowels2+v[j];
		}
		String outputname = vowels2+Consonants;
		System.out.println(outputname);
		
		
	}

public static void Rearrange_word_with_VowelsFirst_approach2(){
		
		String name = "Hi! Jhansi This is - good 843294";
		String name2 = name.toLowerCase().replaceAll("[^a-z]", "");
		String numbers = name.toLowerCase().replaceAll("[^0-9]", "");

		System.out.println(name2);
		System.out.println(numbers);


		int len = name2.length();
		String vowels = "" ;
		String Consonants = "";
		String vowels2 = "";

		for (int i=0;i<len;i++) {
			char c = name2.charAt(i);
			if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u')
			{
				
				vowels = vowels+c;
				
			}else {
				
				Consonants = Consonants+c;
			}
			
			
		}
		
		char[] v = vowels.toCharArray();
		System.out.println(Arrays.toString(v));
		int len2 = v.length;
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));

		for(int j= 0;j<len2;j++ ) {
		vowels2 = vowels2+v[j];
		}
		String outputname = vowels2+Consonants;
		System.out.println(outputname);
		
		
	}

}
