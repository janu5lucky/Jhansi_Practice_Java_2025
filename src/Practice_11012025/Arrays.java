package Practice_11012025;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arraysforint();
arraysalldatatypes();
	}
public static void arraysforint() {
	
	Scanner sc=new Scanner(System.in);
	int[] intarray = {};
	

	for(int i =0; i>=10;i++) {
    intarray[i]=sc.nextInt();

	}
	
	System.out.println(intarray);
}


public static void arraysalldatatypes() {

	 int[] marks_10_board = {90, 91, 95, 99, 100, 78};
    float[] gst_pad = {18.45f, 91.87f, 95.78f, 99.00f, 100.00f, 78.98f};
//    int[] marks_10_board = [90, 91, 95, 99, 100, 78]; - Not possible
    String shoppling_list[] = {"bread", "butter", "milk", "curd"};

    // int[] marks_12_board = {95,96,94,91,"Pramod"};
    char [] grades = {'A','B','C','D','E','F'};
    char [] grades_small = {'a','c','C','D','e','F', '#','@','%'};
    System.out.println(marks_10_board.length);
    System.out.println(marks_10_board[3]); // 99// printing data on index mentioned
    System.out.println(marks_10_board[0]); // 90
 //   System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException
//    System.out.println(marks_10_board[10]);
	
    
    int[] marks = new int[3];
    // index - 0,1,2
    // len - 3
    // Value is not defined only length is defined
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = 92;
    marks[2] = 93;
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
//    System.out.println(marks[10]); // AIOBE

}
	
	
}
