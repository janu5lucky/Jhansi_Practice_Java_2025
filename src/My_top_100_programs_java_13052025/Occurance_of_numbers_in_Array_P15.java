package My_top_100_programs_java_13052025;

import java.util.HashMap;
import java.util.Map;

public class Occurance_of_numbers_in_Array_P15 {

	public static void main(String[] args) {

		int[] arr = {1,4,5,8,1,2,4};
		Occurance_ofnumbers_approach1(arr);
		System.out.println();
		Occurance_ofnumbers_approach2(arr);
	}
public static void Occurance_ofnumbers_approach1(int[] arr) {
	
	int l = arr.length;
	int count =0;
	for(int i =0;i<l;i++) {
		for(int j =i+1;j<l;j++) {
			count=1;
			if(arr[i]==arr[j]) {
				count++;
				System.out.print(arr[i]+"-"+count+", ");
			}
		}
	}
}
public static void Occurance_ofnumbers_approach2(int[] arr) {
	
	int count =0;
	Map<Integer, Integer> map = new HashMap<>();
	for(int num : arr) {
		if(map.containsKey(num)) {
			count = map.get(num);
			count++;
			map.put(num, count);
			
		}else {
			map.put(num, 1);
		}
	}
	for(int key: map.keySet()) {
		if(map.get(key)>1) {
		System.out.print(key+" "+map.get(key)+", ");
		}
	}
}


}
