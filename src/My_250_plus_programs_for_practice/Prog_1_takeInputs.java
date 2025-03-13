package My_250_plus_programs_for_practice;

import java.util.Scanner;

public class Prog_1_takeInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int num = sc.nextInt();
		
		System.out.println("Enter the String : ");
		
		String  str = sc.next();
		
		System.out.println("Enter the Double : ");

		double  db = sc.nextDouble();
		
		System.out.println("Enter the Byte : ");

		byte  Byte = sc.nextByte();
	
		System.out.println("number : "+num);
		System.out.println("String : "+str);
		System.out.println("Double : "+db);
		System.out.println("Byte : "+Byte);

		sc.close();
	
	}

}
