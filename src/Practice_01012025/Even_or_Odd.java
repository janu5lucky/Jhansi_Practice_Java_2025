package Practice_01012025;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		System.out.println("Entere a number A = ");

		int a = input.nextInt();
		
		if (a%2 ==0 ) {
			
			System.out.println("Entered number is Even");
		}
		
		else if (a%2!=0) {
		
			System.out.println("Entered number is Odd");

		}
		
		
		}
		
	}


