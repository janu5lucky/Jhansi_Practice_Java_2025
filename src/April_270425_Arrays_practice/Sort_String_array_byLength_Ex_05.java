package April_270425_Arrays_practice;

import java.util.Arrays;

public class Sort_String_array_byLength_Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "Telugu", "Hindi", "English", "Maths", "Physics", "Chemistry" };
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {

				if (arr[j].length() < arr[i].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
System.out.println(Arrays.toString(arr));
	}

}
