package april_240425_practice;

public class finding_duplicates_inArray {
	public static void main(String[] args) {
		
	
	
	int[] arr = {22,34,56,11,78,34,46,22,46,};
	int l = arr.length;
	int count;
	for(int i=0;i<l;i++) {
		count =1;
		for (int j=i+1;j<l;j++) {
			if(arr[i]==arr[j]) {
			count++;
			System.out.println("Foudn duplicate :"+arr[i]+"repeated " +count);
		}
			
		}
		
	}
	
	
	}
}
