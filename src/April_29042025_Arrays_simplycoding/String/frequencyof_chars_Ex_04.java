package April_29042025_Arrays_simplycoding.String;

import java.util.HashMap;

public class frequencyof_chars_Ex_04 {

	public static void main(String[] args) {

		String str = "aaabbbbssddaannuii";
		HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder output = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c,0)+1);
			if(i+1 == str.length() || str.charAt(i+1)!=c) {
				output.append(c).append("-").append(map.get(c));
				if(i<str.length()-1) {
					output.append(", ");
				}map.clear();
			}
			
		}
		
System.out.println(output.toString());
	}

}
