package Aprl_Interview_questions_08042025;

import java.util.Arrays;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_each_word_in_string();
	}

	public static void Reverse_each_word_in_string() {
		
		String str = "I love Java Programming";
		String[] words = str.split(" ");
		System.out.println("String array of words : "+Arrays.toString(words));
	//	String reverseword ="";
		String revisedsentence = "";
		for(String word : words) {
			String reverseword ="";

			for(int j=word.length()-1;j>=0;j--) {
				reverseword = reverseword+word.charAt(j);
				
			}
			
			revisedsentence = revisedsentence+reverseword+" ";
			
		}
		System.out.println(revisedsentence);
		
	}
	
}
