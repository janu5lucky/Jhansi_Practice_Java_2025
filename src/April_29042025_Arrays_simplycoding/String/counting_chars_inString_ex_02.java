package April_29042025_Arrays_simplycoding.String;

import java.util.Scanner;

public class counting_chars_inString_ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
//		Count_uppercase(str);
	//	System.out.println();
		//Count_Lowercase(str);
		//System.out.println();

		//Count_Digits(str);
		//System.out.println();

		//Count_SplChars(str);
		//System.out.println();
		Count_vowelsandconsinants(str);
		System.out.println();

	}

	public static void Count_uppercase(String str) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
				// System.out.println(c + "-" + count);
			}

		}
		System.out.println("No.of Upppercase count: " + count);

	}

	public static void Count_Lowercase(String str) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				count++;
				// System.out.println(c + "-" + count);
			}

		}
		System.out.println("No.of LowerCase count: " + count);

	}

	public static void Count_Digits(String str) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				count++;
				// System.out.println(c + "-" + count);
			}

		}
		System.out.println("No.of Digits: " + count);

	}

	public static void Count_SplChars(String str) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!Character.isLetterOrDigit(c)) {
				count++;
				// System.out.println(c + "-" + count);
			}

		}
		System.out.println("No.of Special Characters: " + count);

	}
	public static void Count_vowelsandconsinants(String str) {

		int countV = 0, countC =0;
		for (int i = 0; i < str.length(); i++) {
		//	char c = Character.toLowerCase(str.charAt(i));
			char c = str.toLowerCase().charAt(i);
			if(Character.isAlphabetic(c)) {
			if (c=='a' ||c=='e'||c=='i'||c=='o'||c=='u') {
				countV++;
				// System.out.println(c + "-" + count);
			}else {
				countC++;

			}
		}
		}
		System.out.println("No.of Vowels: " + countV++);
		System.out.println("No.of Consonants: " + countC++);

	}

}
