package April_29042025_Arrays_simplycoding.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_to_int_Ex_06 {

	public static void main(String[] args) {

		String str = "01010101";
	//	String_to_int_Approach1(str);
		String_to_int_Approach2(str);

	}

	public static void String_to_int_Approach1(String str) {

		// List<Integer> num0 = new ArrayList<>();
		// List<Integer> num1 = new ArrayList<>();
		String num0 = "";
		String num1 = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				if (c == 0) {
					num0 +=(int)c;
				} else if (c == 1) {

					num1 = num1 + c;
				}
			}
		}
		System.out.println(num0.toString());
		System.out.println(num1.toString());

	}
	
	public static void String_to_int_Approach2(String str) {

		// List<Integer> num0 = new ArrayList<>();
		// List<Integer> num1 = new ArrayList<>();
		int l=str.length();
		int[] num0 = new int[l];
		int[] num1 = new int[l];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				if (c==0) {
					System.out.println(Arrays.toString(num0));
					num0[i] +=(int)c;
				} else if (c == 1) {

					num1[i] += c;
				}
			}
		}
		System.out.println(Arrays.toString(num0));
		System.out.println(Arrays.toString(num1));

	}

	
}
