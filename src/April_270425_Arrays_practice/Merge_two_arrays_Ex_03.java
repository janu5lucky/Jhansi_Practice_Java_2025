package April_270425_Arrays_practice;

import java.util.Arrays;

public class Merge_two_arrays_Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a= {"hello","Hi","am","good"};
		String[] b= {"Yes","This","is","jhansi"};
		String[] c= new String[a.length+b.length];

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		
		System.out.println(Arrays.toString(c));
	}

}
