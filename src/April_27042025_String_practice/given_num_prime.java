package April_27042025_String_practice;

public class given_num_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4, count = 0;
		if (num > 1) 
		{
			for (int i = 1; i < num; i++) {
				if (num % i == 0) 
					count++;
				

			}
			if (count == 2) {
				System.out.println("given num is prime ");
			} else {
				System.out.println("given num is not prime ");

			}

		}else {
			
			System.out.println ("not a prime number");

	}
	}
}
