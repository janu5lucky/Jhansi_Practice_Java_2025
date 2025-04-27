package Aprl_Interview_questions_08042025;

import java.util.Arrays;

public class ReverseArray_wipro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strarr = {"Apple", "Banana","Strawberry","Orange","Mango"};
		
		String[] revarr = new String[strarr.length];
		String text = "mango";
		
		 for (int i = 0; i < strarr.length; i++) {
	            revarr[i] = strarr[strarr.length - 1 - i];
	        }
			
		
		System.out.println("reverse array = "+Arrays.toString(revarr));
		for (String s : revarr) {
			if(text.equalsIgnoreCase(s)) {
				
				System.out.println("found the text :"+text);
				break;
			}if(!text.equalsIgnoreCase(s)) {
				
				System.out.println("No text match found for :"+text);
			}

			
		}

	}

}
