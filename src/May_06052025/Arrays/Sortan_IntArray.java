package May_06052025.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sortan_IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ");
		int l = sc.nextInt();
		int[] nums = new int[l];
		for (int i = 0;i<l;i++) {
			nums[i] = sc.nextInt();
				
			}
		System.out.println(Arrays.toString(nums));
		for(int i =0;i<l;i++) {
			for(int j =i+1;j<l;j++) {
				if(nums[j]<nums[i]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					
					
				}
				
			}
		}		System.out.println("Sorted Array"+Arrays.toString(nums));

		
		
	}

}
