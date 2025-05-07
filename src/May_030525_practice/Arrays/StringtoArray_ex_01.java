package May_030525_practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringtoArray_ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a1b23c44d6";
		System.out.println(str);
		String[] nums = str.split("[^0-9]");
		List<String> numbers = new ArrayList<>();
		for (String num1 : nums) {
					if (!num1.isEmpty()) {
						numbers.add(num1);
					}
				}

				System.out.println(numbers);
				System.out.println(numbers.size());

				
		}
}
