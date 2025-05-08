package May_06052025.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_to_inetegerArray {
	public static void main(String[] args) {
		String str = "a12b34c56";
		String[] strarr = str.split("[^0-9]");
		System.out.println(Arrays.toString(strarr));
		List<Integer> nums = new ArrayList<>();
		for (String str1 : strarr) {
			if (!str1.isEmpty()) {
				Integer n = Integer.parseInt(str1);
				nums.add(n);
			}
		}
		System.out.println(nums);

	}
}