package april_240425_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_to_array_gemini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a1b23c45d54e22";
		int l = str.length();
		String[] arr = str.split("[^a-z]");
		String[] nums = str.split("[^0-9]");
		String[] newnums = new String[nums.length];

		// String num = "";
		/*
		 * for (int i = 0; i <nums.length; i++) { //num = ""; if (!nums[i].equals(null))
		 * { newnums[i] = nums[i];
		 * 
		 * }
		 */
		List<String> numberList = new ArrayList<>();
		for (String num : nums) {
			if (!num.isEmpty()) {
				numberList.add(num);
			}
		}

		System.out.println(numberList);//.toArray(new String[0]);
		System.out.println(numberList.size());//.toArray(new String[0]);

		// Convert the List to a String array
		
		String[] finalNumbers = numberList.toArray(new String[0]);

		System.out.println(Arrays.toString(finalNumbers));
		System.out.println(finalNumbers.length);
	}

}
