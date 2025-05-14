package My_top_100_programs_java_13052025;

public class Prime_in_array_P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,7,8,9,10,11,13,15};
		count_prime_nums(arr);
		
	}

	public static void count_prime_nums(int[] arr) {
		
		int l = arr.length;
		int count =0;
		for(int num : arr) {
			count = 0;
			if(num >= 2) {
				for(int i = 1;i<=num;i++) {
					
					if(num%i == 0) {
						count++;
					}
				}
				if(count >2 ) {
					System.out.println("array number :"+num+ " is not prime ");
				}else {
					System.out.println("array number :"+num+ " is prime ");

				}
			}else {
				System.out.println("array number :"+num+ " is prime ");

			}
			
			
		}
		
	}
	
}
