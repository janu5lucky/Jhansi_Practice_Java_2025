package april_240425_practice;

import java.util.HashMap;

public class count_abc_duplicate_InString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input = "aabbbc
		//output =a2b3c1
		
		String str = "aabbbcdddd";
		String out ="";
		int l = str.length();
		int count;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i =0;i<l;i++) {
			
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				count = map.get(c);
				count++;
				map.replace(c, count);
					
				
		}else {
			
			map.put(c,1);
		}

			
		}
		for (Character key : map.keySet()) {
			System.out.print(key+""+map.get(key));
			
		}System.out.println();
		for (Character key : map.keySet()) {
			System.out.println(key+" occured "+map.get(key));
			
		}
		
	}

}
