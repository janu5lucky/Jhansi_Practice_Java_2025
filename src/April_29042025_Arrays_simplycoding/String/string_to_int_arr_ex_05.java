package April_29042025_Arrays_simplycoding.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class string_to_int_arr_ex_05 {

	public static void main(String[] args) {

	
		String str1 = "a1b23c32d2";
	//	StringtoArray_approach1(str1);
	//	StringtoArray_approach2(str1);
	//	string_to_String_int_approach1(str1);
		StringtoArray_approach3(str1);
		
	}

	public static void StringtoArray_approach1(String str) {
		
		String[] arr = str.split("[^0-9]");
		System.out.println(Arrays.toString(arr));
		List<Integer> num =  new ArrayList<>();
		for(String s: arr) {
			if(!s.isEmpty()) {
				num.add(Integer.parseInt(s));
			}
			
		}System.out.println(num);
		
		
	}
	
public static void StringtoArray_approach3(String str) {
		
		String[] arr = str.split("[^0-9]");
		System.out.println(Arrays.toString(arr));
		String[] num =  new String[arr.length-1];
		for(int i =1;i<arr.length-1;i++) {
			
			num[i] = arr[i+1];
			
		}System.out.println(Arrays.toString(num));
		
		
	}
public static void StringtoArray_approach2(String str) {
		
		int l = str.length();
		String [] arr = new String[l]; 
		StringBuilder s1 = new StringBuilder();
		List<Integer> num = new ArrayList<>();		
		for(int i=0;i<l-1;i++) {
			if(Character.isDigit(str.charAt(i))) {
				arr[i] = ""+str.charAt(i);
			}
			else if(i+1 == str.length() || Character.isDigit(str.charAt(i+1))) {
				s1.append(str.charAt(i)).append(str.charAt(i+1));
				arr[i] = ""+s1;
				String s2 ="";
				s2 = s1.toString();
				}
			}
		System.out.println(Arrays.toString(arr));
		for(String c : arr) {
			if(c!=null) {
				int n= Integer.parseInt(c);
				num.add(n);
			}
		}System.out.println(num);
		
	}
	

public static List<Integer> extractNumbers_gemini(String str) {
    List<Integer> numbers = new ArrayList<>();
    StringBuilder currentNumber = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isDigit(ch)) {
            currentNumber.append(ch);
        } else {
            if (currentNumber.length() > 0) {
                numbers.add(Integer.parseInt(currentNumber.toString()));
                currentNumber.setLength(0); // Clear the StringBuilder
            }
        }
    }

    // Add any remaining number at the end of the string
    if (currentNumber.length() > 0) {
        numbers.add(Integer.parseInt(currentNumber.toString()));
    }

    return numbers;
}

public static List<Integer> extractNumbers_gemini2(String str) {
    List<Integer> numbers = new ArrayList<>();
    String currentNumber = "";

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isDigit(ch)) {
            currentNumber += ch;
        } else {
            if (!currentNumber.isEmpty()) {
                numbers.add(Integer.parseInt(currentNumber));
                currentNumber = ""; // Reset the currentNumber string
            }
        }
    }

    // Handle any remaining number at the end
    if (!currentNumber.isEmpty()) {
        numbers.add(Integer.parseInt(currentNumber));
    }

    return numbers;
}
public static void string_to_String_int_approach1(String str) {
	
	String s="";
	String r ="";
	for(char c : str.toCharArray()) {
		if(Character.isDigit(c)) {
			s +=c;
			
		}else {
			r +=c;
			
		}
		
	}System.out.println("String with Letters : "+s);
	System.out.println("String with Numbers : "+r);
	System.out.println("String Numbers first then Letters : "+s+" "+r);
	
}

}

