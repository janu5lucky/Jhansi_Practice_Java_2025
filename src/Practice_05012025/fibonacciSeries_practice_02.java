package Practice_05012025;

public class fibonacciSeries_practice_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n= 10;
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" "+n2);
		
		for(int i=1; i<=n;i++) {
			
			sum = n1+n2;
			System.out.print(" "+sum);
			
			n1=n2;
			n2=sum;

		}
		
	}

}
