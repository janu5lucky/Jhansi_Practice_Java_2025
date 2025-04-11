package My_250_plus_programs_for_practice.Collections;

public class CountDuplicates_inArrays {

	public static void main(String[] args) {

		Identify_duplicates_int_inArray_01();
		
		
	}
	
	public static void Identify_duplicates_int_inArray_01() {
		
		
		int[] narr = {1,2,3,4,5,1,2,3,4,7,8,9};
		int count = 0;
		int n = narr.length;
		int[] newarr = new int[n];
		int num=0;
		for(int i=0; i>n-1;i++) {
		for(int j =0;j<n-1;j++)	
			if(narr[j]==narr[j+1]) {
				count++;
			}else {
				num = narr[j];
			}
			
			//newarr = newarr
		}
		
		
		System.out.println(count);
		
	}

}
