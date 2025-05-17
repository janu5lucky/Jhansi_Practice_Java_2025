package My_top_100_programs_java_13052025;

public class multiple_finder_Cpagemini_P18 {

   public static void findMultiple(int num1, int num2, int limit) {
		        for (int i = 1; i <= limit; i++) {
		            if (i % num1 == 0 || i % num2 == 0) {
		                System.out.println(i);
		            }
		        }
		    }
   public static void findMultiple02(int num1, int limit) {
       for (int i = 1; i <= limit; i++) {
           if (i % num1 == 0) {
               System.out.println(i);
           }
       }
   }
		    public static void main(String[] args) {
		      //  findMultiple(3, 5, 50); // Find multiples of 3 or 5 up to 50
		    	findMultiple02(3,50);
		    	
		    }
		}
