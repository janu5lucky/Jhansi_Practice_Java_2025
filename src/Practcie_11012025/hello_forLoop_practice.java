package Practcie_11012025;

public class hello_forLoop_practice {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//Print_hello_10times_forLoop();
	//	Print_hello_10times_forLoop_Withspace();	
		
		Print_123_Pyramid_forLoop();
		
	}

	public static void Print_hello_10times_forLoop() {
		for(int i =1;i<=10;i++) {
			System.out.println("hello! "+i);
		}
		
	}
	
	public static void Print_hello_10times_forLoop_Withspace() {
		for(int i =1;i<=10;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			System.out.println("hello! "+i);
		}
	}	
		public static void Print_123_Pyramid_forLoop() {
			for(int i =1;i<=10;i++) {
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println("");
			}
		
	}
	
	
}
