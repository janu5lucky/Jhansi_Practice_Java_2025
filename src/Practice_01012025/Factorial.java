package Practice_01012025;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("Enter input numer for Factorial");
	
	int num = input.nextInt();
	

		BigInteger result2 =BigInteger.ONE;
		for (int i=1;i<=num;i++)
		{
			result2 = result2.multiply(BigInteger.valueOf(i));
			
			
		}
		System.out.println(result2);



	}

	//return;
	
	
}

