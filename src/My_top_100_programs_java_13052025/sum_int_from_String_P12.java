package My_top_100_programs_java_13052025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sum_int_from_String_P12 {

	public static void main(String[] args) {
		String str = "a2b3c5d6";
		String[] numbers = str.split("[^0-9]");
		List<Integer> nums = new ArrayList<>();
		int sum = 0;
		for (String num : numbers) {
			if (!num.isEmpty()) {
				nums.add(Integer.parseInt(num));
			}
		}
		System.out.println(nums);
		for(int num:nums) {
			sum +=num;
		}		System.out.println("sum :"+sum);

	}

}
