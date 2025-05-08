package May_06052025.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class int_string_toArray_largest_WiproL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "50890990";
		String substr = new String();
		List<Integer> numbers = new ArrayList<>();
		String strarr[] = new String[str.length()];
		
		for(int i =0;i<str.length()-1;i++) {
			if(i!=str.length()-1) {
			substr="";
			substr =substr+str.charAt(i)+(str.charAt(i+1));
			strarr[i] = substr;
			}else {
				
			}
		} System.out.println(Arrays.toString(strarr));
		
		for(String s: strarr) {
			if(s!=null) {
				int num = Integer.parseInt(s);
				numbers.add(num);
				
			}
		}System.out.println(numbers);
		System.out.println(Collections.max(numbers));
		
	}

}
