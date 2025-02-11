package Practice_01012025;

public class Swap_number_with_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap_with_temp_variable();
		swap_without_temp_variable();
		
	
		
	}

	public static void swap_with_temp_variable()
	{
		int a = 10;
		int b = 20;
		System.out.println("*******Method 1 with Temp Variable*******");

		System.out.println("Values of a and b Before Swap a = "+a+ " b = "+b);
		
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Values of a and b After Swap a = "+a+ " b = "+b);
	
		
		
	}
	public static void swap_without_temp_variable()
	{
		int a = 10;
		int b = 20;
		System.out.println("******Method 1 without Temp Variable*******");

		System.out.println("Values of a and b Before Swap a = "+a+ " b = "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values of a and b After Swap a = "+a+ " b = "+b);
	
		
		
	}

}
