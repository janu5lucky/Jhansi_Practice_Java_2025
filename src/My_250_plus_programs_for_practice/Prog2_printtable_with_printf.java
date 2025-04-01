package My_250_plus_programs_for_practice;

import java.util.Scanner;

public class Prog2_printtable_with_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Number for table : ");
		int num = sc.nextInt();
		for(int i = 1; i<=10;i++) {
			
		
		System.out.printf("%d%d%d\n", num+"X"+i+"=", num*i);
		
		
		}
	}

}
