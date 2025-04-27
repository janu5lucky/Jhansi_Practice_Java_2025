package Aprl_Interview_questions_08042025;

import java.util.HashMap;

public class countwords_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Hi Hi This this is is Jhansi";
		String[] arr = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		int count = 1;
		for(String s:arr) {
			if(!map.containsKey(s)) {
				map.put(s.toLowerCase(), count);
			}else {
				
				map.put(s,map.get(s)+1);
			}
			
		}
		
				for(String x :map.keySet()) {
					System.out.println("the count of words : "+x+" = "+map.get(x));
				}
	}

}
