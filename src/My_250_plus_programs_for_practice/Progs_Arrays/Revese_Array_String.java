package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.Arrays;

public class Revese_Array_String {

	public static void main(String[] args) {

		String[] strarr = {"apple" , "mango", "grape", "orange"};

		String text= "apple";

		String[] revarr = new String [strarr.length];
		int len = strarr.length;
		int i=0;
		int j = len-1;
		while (i<j) {
			String temp = strarr[i];
			revarr[i] = strarr[j];
			strarr[j] = temp;
			i++;
			j--;
			
		}
		System.out.println("found :text " +Arrays.toString(revarr));

		for(String str : revarr) {
		if (str.equals(text)){
		System.out.println("found :text " +text);

		}else{

			System.out.println("Textnot found" +text);

		}

		}


		
		
	}

}
