package My_top_100_programs_java_13052025;

import java.util.ArrayList;
import java.util.List;

public class String_to_num_P10 {

	public static void main(String[] args) {
 
		String str ="a12b32c31n35";
		String[] numbers = str.split("[^0-9]");
		int l = str.length();
		List<Integer> list = new ArrayList<>();
		for(String s:numbers) {
			if(!s.isEmpty()) {
				list.add(Integer.parseInt(s));
				
			}
			
		}System.out.println(list);
		
	}

}
