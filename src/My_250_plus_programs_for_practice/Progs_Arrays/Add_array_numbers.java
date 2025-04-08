package My_250_plus_programs_for_practice.Progs_Arrays;

import java.util.Arrays;

public class Add_array_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add_array_data();
		multi_array_sum();
	}

	public static void multi_array_sum() {

		int[][] data = { { 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } };
		int sum =0;
		int sum2 = 0;
	
		for (int i = 0; i < data.length; i++) {
			sum = sum+data[i][i];
		
			if(i==0) {
				sum2 = sum2+data[i][i+2]; 
			}if (i==1) {
				sum2 = sum2+data[i][i]; 

			}if(i==2) {
				sum2 = sum2+data[i][0]; 

			}
		}
		
		System.out.println(sum);
		System.out.println(sum2);

	}

	public static void add_array_data() {

		int[] numarray = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0;

		for (int i = 0; i < numarray.length; i++) {
			sum = sum + numarray[i];

		}

		System.out.println("sum : " + sum);

	}

}
