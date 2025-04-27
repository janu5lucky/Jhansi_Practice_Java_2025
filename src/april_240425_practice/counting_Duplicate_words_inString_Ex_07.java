package april_240425_practice;

import java.util.HashMap;

public class counting_Duplicate_words_inString_Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hi hi I learn Java Program program yes good";
		String[] arr = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		int count = 1;
		for (String s : arr) {
			if (!map.containsKey(s)) {
				map.put(s.toLowerCase(), count);

			} else {
				map.put(s, map.get(s) + 1);

			}

		}
		for (String x : map.keySet()) {
			System.out.println("the count of words : " + x + " = " + map.get(x));
		}
	}

}
