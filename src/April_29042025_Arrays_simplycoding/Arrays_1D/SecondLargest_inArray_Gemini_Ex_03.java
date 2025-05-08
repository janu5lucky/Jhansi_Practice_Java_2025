package April_29042025_Arrays_simplycoding.Arrays_1D;

public class SecondLargest_inArray_Gemini_Ex_03 {

	
	    public static void main(String[] args) {
	        int[] nums1 = {10, 5, 8, 20, 15};
	        int[] nums2 = {5, 5, 5, 5};
	        System.out.println("Second largest in nums1: " + Findsecondlargest(nums1));
	        System.out.println("Second largest in nums2: " + Findsecondlargest(nums2));
	    }


	public static int Findsecondlargest(int[] arr) {
		if(arr.length<2) {
			
            System.out.println("Array size should be at least 2");
    		return -1;

		}
		
		
		int largestnumber = arr[0];
		int SecondLargest = arr[0];
		for(int num: arr) {
			if(num>largestnumber) {
				SecondLargest= largestnumber;
				largestnumber = num;
				
			}else if(num>SecondLargest && num!=largestnumber) {
				SecondLargest = num;
			}
			
		}
        return SecondLargest;
	}
	
}
