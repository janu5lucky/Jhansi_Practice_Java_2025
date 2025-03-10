package Practice_11012025;

import java.util.Scanner;

public class n_series_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	✔ Used loops to generate the series efficiently
	//	✔ Used Math.pow(2, j) * b to compute terms
	//	✔ Printed all terms in a single line
	//	✔ Used 1 << j for optimized performance
		
		
	/*
	 * for (int j = 0; j < n; j++) { sum += (1 << j) * b; // Using bitwise left
	 * shift for 2^j System.out.print(sum + " "); }
	 */

		
		 Scanner scanner = new Scanner(System.in);

	        int t = scanner.nextInt(); // Number of queries

	        for (int i = 0; i < t; i++) {
	            int a = scanner.nextInt(); // Initial value
	            int b = scanner.nextInt(); // Multiplication factor
	            int n = scanner.nextInt(); // Number of terms

	            int sum = a; // Start with 'a'

	            for (int j = 0; j < n; j++) {
	                sum += Math.pow(2, j) * b; // Compute next term
	                System.out.print(sum + " "); // Print in same line
	            }
	            System.out.println(); // Move to next line for next query
	        }

	        scanner.close();
	   
	}

}
