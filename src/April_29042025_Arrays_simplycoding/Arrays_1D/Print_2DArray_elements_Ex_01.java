package April_29042025_Arrays_simplycoding.Arrays_1D;

import java.util.Arrays;

public class Print_2DArray_elements_Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Print_2Darray_allvalues();
		System.out.println();
		Printfisrtandlastrows_in2Darrays();
		System.out.println();

		Print_border_cell_values_array();
		System.out.println();

		Print_belowdaigonal_array();
		System.out.println();
		Print_AboveDiagonal_array();
		
		
		
	}
 public static void Print_2Darray_allvalues() {
	 
	 int[][] arr = {{1,2},
				{3,4},
				{5,6}};

for(int i =0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		int n = arr[i][j];
		System.out.print(n+", ");
		
	}System.out.println();
}

 }

 public static void Printfisrtandlastrows_in2Darrays() {
	 
	 int[][] arr = {{1,2},
				{3,4},
				{5,6}};

for(int i =0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		
		if(i==0||i==arr.length-1) {
		int n = arr[i][j];
		System.out.print(n+" ");
		}else {
			System.out.print(" ");

		}
		
	}System.out.println();
}
 }
 public static void Print_border_cell_values_array() {
	 
	 int[][] arr = {{1,2,3},
			 		{4,5,6},
			 		{7,8,9}};

for(int i =0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		
		if(i==0||i==arr.length-1 || j==0 || j==arr[0].length-1) {
		int n = arr[i][j];
		System.out.print(n+" ");
		}else {
			System.out.print("  ");

		}
		
	}System.out.println();
}
 }
public static void Print_belowdaigonal_array() {
	 
	 int[][] arr = {{1,2,3},
			 		{4,5,6},
			 		{7,8,9}};

for(int i =0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		
		if(i>=j) {
		int n = arr[i][j];
		System.out.print(n+" ");
		}else {
			System.out.print("  ");

		}
		
	}System.out.println();
}
 }
public static void Print_AboveDiagonal_array() {
	 
	 int[][] arr = {{1,2,3},
			 		{4,5,6},
			 		{7,8,9}};

for(int i =0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		
		if(i<=j) {
		int n = arr[i][j];
		System.out.print(n+" ");
		}else {
			System.out.print("  ");

		}
		
	}System.out.println();
}
}

 
}
