package April_270425_Arrays_practice;

import java.util.Arrays;

public class Reverse_ArrayString_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Hello","World","How","are","you","ok"};
		int l = arr.length;
		
		for(int i =0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
