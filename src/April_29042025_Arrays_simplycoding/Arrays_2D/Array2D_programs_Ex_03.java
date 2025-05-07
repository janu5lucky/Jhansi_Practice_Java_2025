package April_29042025_Arrays_simplycoding.Arrays_2D;

public class Array2D_programs_Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		program1_summall_elements_in_2Darrays();
		System.out.println();
		program2_sum_all_diagonal_elements_in_2Darrays();
		System.out.println();
		program3_sumof_1strow();
		System.out.println();
		program4_sumof_1st_and_lastRows();
		System.out.println();
		program5_sumof_EachRows();
		System.out.println();
		program6_sumof_Eachcolumn();
		System.out.println();
		program7_min_valuein_2Darray();
		System.out.println();
		program8_max_valuein_2Darray();
		System.out.println();
		
	}

	static void program1_summall_elements_in_2Darrays() {
		int[][] arr = { { 11, 52, 33 }, { 34, 66, 21 }, { 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int sum = 0;
		for (int r = 0; r < l; r++) {
			for (int c = 0; c < l2; c++) {

				sum += arr[r][c];
			}

		}
		System.out.println("sum of arrays elements " + sum);

	}

	static void program2_sum_all_diagonal_elements_in_2Darrays() {
		int[][] arr = { { 11, 52, 33 }, { 34, 66, 21 }, { 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int sum = 0;
		for (int r = 0; r < l; r++) {
			for (int c = 0; c < l2; c++) {
				if (r == c || r + c + 1 == l) {
					sum += arr[r][c];
				}
			}

		}
		System.out.println("sum of diagonal elements " + sum);

	}

	static void program3_sumof_1strow() {
		int[][] arr = { { 11, 52, 33 }, { 34, 66, 21 }, { 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int sum = 0;
		for (int r = 0; r < l; r++) {
			for (int c = 0; c < l2; c++) {
				if (r == 0)
					sum += arr[r][c];
			}

		}
		System.out.println("sum of arrays 1st row elements " + sum);

	}

	static void program4_sumof_1st_and_lastRows() {
		int[][] arr = { { 11, 52, 33 }, { 34, 66, 21 }, { 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int sum = 0;
		for (int r = 0; r < l; r++) {
			for (int c = 0; c < l2; c++) {
				if (r == 0 || r == l - 1)
					sum += arr[r][c];
			}

		}
		System.out.println("sum of arrays 1st and Last rows elements " + sum);

	}

	static void program5_sumof_EachRows() {
		int[][] arr = { { 11, 52, 33 }, { 34, 66, 21 }, { 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int sum = 0;
		for (int r = 0; r < l; r++) {
			sum = 0;
			for (int c = 0; c < l2; c++) {
				sum += arr[r][c];
			}
			System.out.println("sum of row number-"+r+": " + sum);

		}

	}
	static void program6_sumof_Eachcolumn() {
		int[][] arr = { { 11, 52, 33 }, 
						{ 34, 66, 21 }, 
						{ 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int sum = 0;
		int count = 0;
		for (int c = 0; c < l2; c++) {
			sum = 0;
		for (int r = 0; r < l; r++) {
				sum += arr[r][c];
			}
			System.out.println("sum of col number-"+c+": " + sum);

		}

	}
	static void program7_min_valuein_2Darray() {
		int[][] arr = { { 11, 52, 33 }, { 34, 66, 21 }, { 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int min = arr[0][0];
		for (int r = 0; r < l; r++) {
			for (int c = 0; c < l2; c++) {
				if(arr[r][c]<min) {
					min = arr[r][c];
				}
			}

		}			System.out.println("min number : " + min);


	}

	static void program8_max_valuein_2Darray() {
		int[][] arr = { { 11, 52, 33 }, { 34, 66, 21 }, { 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int max = arr[0][0];
		for (int r = 0; r < l; r++) {
			for (int c = 0; c < l2; c++) {
				if(arr[r][c]>max) {
					max = arr[r][c];
				}
			}

		}			System.out.println("min number : " + max);


	}

	static void program9_max_valuein_2Darray() {
		int[][] arr = { { 11, 52, 33 }, { 34, 66, 21 }, { 45, 88, 76 } };

		int l = arr.length;
		int l2 = arr[0].length;
		int max = arr[0][0];
		for (int r = 0; r < l; r++) {
			for (int c = 0; c < l2; c++) {
				if(arr[r][c]>max) {
					max = arr[r][c];
				}
			}

		}			System.out.println("max number : " + max);


	}


}
