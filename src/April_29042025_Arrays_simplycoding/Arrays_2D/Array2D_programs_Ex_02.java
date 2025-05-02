package April_29042025_Arrays_simplycoding.Arrays_2D;

import java.util.Arrays;

public class Array2D_programs_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program1_multiplying_all_2Darray_elements();
		System.out.println();
		program2_Squreof_all_2Darray_elements();
		System.out.println();

		program3_Cubeof_all_2Darray_elements();
		System.out.println();
		
		program4_replace_neg_with_0_all_2Darray_elements();
		System.out.println();
		program5_swap_firststandlastrows_2Darray_elements();
		System.out.println();
		program6_swap_firststandlastrcolumns_2Darray_elements();
		System.out.println();
		program7_swap_firsttolastrow_2Darray_elements();
		System.out.println();
		program8_CircularShift_down_2Darray_elements();
		System.out.println();
		program9_CircularShift_left_2Darray_elements();
		System.out.println();
		program10_CircularShift_right_2Darray_elements();
		System.out.println();
		program11_CreateMirror_2Darray_elements();
		System.out.println();
		program12_transpose_2Darray_elements();
		System.out.println();
		program12A_transpose_2Darray2X3_elements();
		System.out.println();
		program12B_transpose_2Darray3X2_elements();
		System.out.println();
		program13_Sort_2Darray_ascending_elements();
		System.out.println();
		
	}

	static void program1_multiplying_all_2Darray_elements() {
		
		int[][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		int[][] arr1 = new int[3][3];
		int l = arr.length;
		for(int i =0;i<l;i++) {
			for(int j =0;j<l;j++) {
			arr1[i][j] = arr[i][j]*10;
				
			}
			
		}
		System.out.println("10 multiples of all elements in the Array");

		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr));

	}
static void program2_Squreof_all_2Darray_elements() {
		
		int[][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		int[][] arr1 = new int[3][3];
		int l = arr.length;
		for(int i =0;i<l;i++) {
			for(int j =0;j<l;j++) {
			arr1[i][j] = (int) Math.pow(arr[i][j],2);
				
			}
			
		}
		System.out.println("Square of all elements in the Array");

		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr));

	}
static void program3_Cubeof_all_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int[][] arr1 = new int[3][3];
	int l = arr.length;
	for(int i =0;i<l;i++) {
		for(int j =0;j<l;j++) {
		arr1[i][j] = (int) Math.pow(arr[i][j],3);
			
		}
		
	}
	System.out.println("Cube of all elements in the Array");

	System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));
}
static void program4_replace_neg_with_0_all_2Darray_elements() {
	
	int[][] arr = {{1,-2,3},
					{4,-5,6},
					{7,-8,9}};
	int[][] arr1 = new int[3][3];
	int l = arr.length;
	System.out.println(Arrays.deepToString(arr));

	for(int i =0;i<l;i++) {
		for(int j =0;j<l;j++) {
			if(arr[i][j]<0) {
				arr[i][j] = 0;
			}
		}
		
	}
	System.out.println("Replaced Negative with 0's of all elements in the Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));

}

static void program5_swap_firststandlastrows_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int[][] arr1 = new int[3][3];
	int l = arr.length;
	System.out.println(Arrays.deepToString(arr));
	int row1=0;
	int row2 = l-1;
		for(int col =0;col<l;col++) {
			int temp = arr[row1][col];
			arr[row1][col] = arr[row2][col];
			arr[row2][col] = temp;
		}
		
	
	System.out.println("Swap 1st and last row in the Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));

}

static void program6_swap_firststandlastrcolumns_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int[][] arr1 = new int[3][3];
	int l = arr.length;
	System.out.println(Arrays.deepToString(arr));
	int col1=0;
	int col2 = l-1;
		for(int row =0;row<l;row++) {
			int temp = arr[row][col1];
			arr[row][col1] = arr[row][col2];
			arr[row][col2] = temp;
		}
		
	
	System.out.println("Swap 1st and last Columns in the Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));

}

static void program7_swap_firsttolastrow_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int l = arr.length;
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l-1;row++) {
			for(int col=0;col<arr[0].length;col++) {
			int temp = arr[row][col];
			arr[row][col] = arr[row+1][col];
			arr[row+1][col] = temp;
		}
		}	
	
	System.out.println("Move 1st row to last Last and 2nd to 1st row in the Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));

}
static void program8_CircularShift_down_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int l = arr.length;
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =l-1;row>0;row--) {
			for(int col=0;col<arr[0].length;col++) {
			int temp = arr[row][col];
			arr[row][col] = arr[row-1][col];
			arr[row-1][col] = temp;
		}
		}	
	
	System.out.println("Circulaershift down, last row to first, 1st to 2nd and 2nd to last row  in the Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));

}
static void program9_CircularShift_left_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int l = arr.length;
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l;row++) {
			for(int col=0;col<arr[0].length-1;col++) {
			int temp = arr[row][col+1];
			arr[row][col+1] = arr[row][col];
			arr[row][col] = temp;
		}
		}	
	
	System.out.println("Circulaershift left, 1st column to last in the Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));

}

static void program10_CircularShift_right_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int l = arr.length;
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l;row++) {
			for(int col=arr[0].length-1;col>0;col--) {
			int temp = arr[row][col];
			arr[row][col] = arr[row][col-1];
			arr[row][col-1] = temp;
		}
		}	
	
	System.out.println("Circulaershift right, last column to first in the Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));

}
static void program11_CreateMirror_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int l = arr.length;
	int l2 = arr[0].length;
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l;row++) {
			for(int col=0;col<l2/2;col++) {
			int temp = arr[row][col];
			arr[row][col] = arr[row][l2-1-col];
			arr[row][l2-1-col] = temp;
		}
		}	
	
	System.out.println("Mirror array of original Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr));

}
static void program12_transpose_2Darray_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	
	int l = arr.length;
	int l2 = arr[0].length;
	int[][] arr1 = new int[l][l2];
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l;row++) {
			for(int col=0;col<l2;col++) {
			arr1[row][col] = arr[col][row];
			
		}
		}	
	
	System.out.println("Transpose of Array");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr1));

}
static void program12A_transpose_2Darray2X3_elements() {
	
	int[][] arr = {{1,2,3},
					{4,5,6}};
	
	int l = arr.length;
	int l2 = arr[0].length;
	int[][] arr1 = new int[l2][l];
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l2;row++) {
			for(int col=0;col<l;col++) {
			arr1[row][col] = arr[col][row];
			
		}
		}	
	
	System.out.println("Transpose of Array 2X3 array to 3X2");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr1));

}
static void program12B_transpose_2Darray3X2_elements() {
	
	int[][] arr = {{1,2},
					{3,4},
					{5,6}};
	
	int l = arr.length;
	int l2 = arr[0].length;
	int[][] arr1 = new int[l2][l];
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l2;row++) {
			for(int col=0;col<l;col++) {
			arr1[row][col] = arr[col][row];
			
		}
		}	
	
	System.out.println("Transpose of Array 3X2 array to 2X3");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr1));

}
static void program13_Sort_2Darray_ascending_elements() {
	
	int[][] arr = {{11,52,33},
					{34,66,21},
					{45,88,76}};
	
	int l = arr.length;
	int l2 = arr[0].length;
	int[][] arr1 = new int[l][l2];
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l;row++) {
			for(int col=0;col<l;col++) {
			if(arr[row][col]> arr[row+1][col+1]) {
				int temp = arr[row][col];
				arr[row][col] = arr[row+1][col+1];
				arr[row+1][col+1] = temp;
			}
		}
		}	
	
	System.out.println("Sorting an array ascending");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr1));

}
static void program14_Sort_2Darray_descending_elements() {
	
	int[][] arr = {{11,52,33},
					{34,66,21},
					{45,88,76}};
	
	int l = arr.length;
	int l2 = arr[0].length;
	int[][] arr1 = new int[l2][l];
	System.out.println(Arrays.deepToString(arr));
	
		for(int row =0;row<l-1;row++) {
			for(int col=0;col<l2-1;col++) {
			if(arr[row][col]> arr[row+1][col+1]) {
				int temp = arr[row][col];
				arr[row][col] = arr[row+1][col+1];
				arr[row+1][col+1] = temp;
			}
		}
		}	
	
	System.out.println("Transpose of Array 3X2 array to 2X3");

	//System.out.println(Arrays.deepToString(arr1));
	System.out.println(Arrays.deepToString(arr1));

}


}
