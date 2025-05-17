package My_top_100_programs_java_13052025;

public class second_largest_int_P20 {

	public static void main(String[] args) {
		 int[] nums1 = {10, 5, 8, 20, 15};
	      int[] nums2 = {5, 5, 5, 5};
	        secondlargestnum(nums1);
	        secondlargestnum(nums2);
		
		
		
	}
	
	public static void secondlargestnum(int[] arr) {
		if(arr.length<2) {
			
            System.out.println("Array size should be at least 2");
    		//return -1;

		}
		int l =arr.length;
		int largest = arr[0];
		int secondlargest = arr[0];
		for(int i =1;i<l;i++) {
			if(arr[i]>largest) {
				secondlargest = largest;
				largest = arr[i];
			}else if (arr[i]>secondlargest && arr[i]!=largest) {
				secondlargest = arr[i];
			}
		}System.out.println(secondlargest);
		
	}

}
