package My_top_100_programs_java_13052025;

import java.util.Scanner;

public class given_number_is_prime_P03 {

	public static void main(String[] args) {
// This is working
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int num = sc.nextInt();
		//primenumber_check_approach1(num);
		primenumber_check_approach2(num);
	}

	public static void primenumber_check_approach1(int num) {
		int count = 0;

		if (num >= 2) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;

				}
			}
			if (count > 2) {

				System.out.println("number is not prime");
			} else {
				System.out.println("number is prime");

			}
		} else {
			System.out.println("number is prime");
		}
	}

	public static void primenumber_check_approach2(int num) {
		int count = 0;
		int i = 1;
		if (num >= 2) {

			while (i <= num) {
				if (num % i == 0) {
					count++;

				}
				i++;
			}
			if (count > 2) {

				System.out.println("number is not prime");
			} else {
				System.out.println("number is prime");

			}
		} else {
			System.out.println("number is prime");
		}
	}

}
