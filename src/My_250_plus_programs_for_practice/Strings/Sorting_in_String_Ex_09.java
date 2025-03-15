package My_250_plus_programs_for_practice.Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorting_in_String_Ex_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sorting_String_using_arraysSort();
		Sorting_String_solution_byGvreddy();
		
		
	}

	public static void Sorting_String_using_arraysSort()
	{
		String s = "jhansi";
		
		char[] c = s.toCharArray();
		
		Arrays.sort(c);
		String n = c.toString();
			
		System.out.println("Words Sorted "+Arrays.toString(c));
	//	System.out.println("Words Sorted to String"+n);

		
	}

	public static void Sorting_String_solution_byGvreddy()
	{
		String s = "jhansi";
		
		String sorted = s.chars().sorted().mapToObj(c->String.valueOf((char)c))
				.collect(Collectors.joining());
		
		//Arrays.sort(c);
		//String n = c.toString();
			
		System.out.println("Words Sorted "+sorted);
	//	System.out.println("Words Sorted to String"+n);

		
	}

}
