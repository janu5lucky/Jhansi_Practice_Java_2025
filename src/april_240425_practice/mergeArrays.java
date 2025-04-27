package april_240425_practice;

import java.util.Arrays;

public class mergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 10, 11, 12, 13, 14, 15, 16 };
		int[] c = new int[a.length + b.length];

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
	}

}
