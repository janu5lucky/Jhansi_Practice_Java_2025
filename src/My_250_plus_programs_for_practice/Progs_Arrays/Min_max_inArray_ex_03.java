package My_250_plus_programs_for_practice.Progs_Arrays;

public class Min_max_inArray_ex_03 {
	
	public static void main (String args[]) {
		
		min_and_max_in_Array_approach1();
		
	}

	public static void min_and_max_in_Array_approach1() {
		
		int[] num = {6,4,7,89,23,56,87,2,22,54,67};
		int min=num[0];
		int max=num[0];
		int len = num.length;
		// with simple for loop
		for(int i =0;i<len;i++) {
			int c = num[i];
			if(c>max)	
				max=c;
				
			
			if (c<min) 
				min = c;
						
			
		}
		
		System.out.println ("Max number from Array :"+max);
		System.out.println ("Min number from Array :"+min);

	}

public static void min_and_max_in_Array_approach2() {
		
		int[] num = {6,4,7,89,23,56,87,2,22,54,67};
		int min=num[0];
		int max=num[0];
		int len = num.length;
		// with simple for loop
		for(int i : num) {
		//	int c = num[i];
			if(i>max)	
				max=i;
				
			
			if (i<min) 
				min = i;
						
			
		}
		
		System.out.println ("Max number from Array :"+max);
		System.out.println ("Min number from Array :"+min);

	}

	
}
