package april_240425_practice;

import java.util.HashMap;

public class CharacterFrequency_array_WiproL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "aaaabbbddddccccaaababb";
	        findCharacterFrequencies(str);
	        
	}
	    public static void findCharacterFrequencies(String str) {
	        if (str == null || str.isEmpty()) {
	            return;
	        }

	        HashMap<Character, Integer> charCountMap = new HashMap<>();
	        StringBuilder output = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);

	            if (i + 1 == str.length() || str.charAt(i + 1) != currentChar) {
	                output.append(currentChar).append("-").append(charCountMap.get(currentChar));
	                if (i < str.length() - 1) {
	                    output.append(", ");
	                }
	                charCountMap.clear(); // Reset the map for the next sequence
	            }
	        }

	        System.out.println(output.toString());
	    

	}

}
