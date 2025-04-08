package Practice_beaconLi_05042025;

import java.util.Arrays;

public class JavaClass_05 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		 String[] arr = {"apple", "banana","orange","strawberry","grape" };
         String[] Sortarr = new String[arr.length];
         for (int i =0; i<arr.length-1;i++){
             if(arr[i].length()>arr[i+1].length()){
                 String temp = arr[i+1];
                 arr[i+1]=arr[i];
                 arr[i]=temp;
             }
             Sortarr[i] = Sortarr+arr[i];

         }

         System.out.println("Sorted by Length :"+Arrays.toString(Sortarr));
     }
 
}
