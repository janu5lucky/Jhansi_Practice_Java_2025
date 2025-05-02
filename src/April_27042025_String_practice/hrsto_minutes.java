package April_27042025_String_practice;

import java.util.Arrays;

public class hrsto_minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1hr, 22min, 30sec";
		String[] arr = str.split(",");
		Integer hr=0;//= Integer.parseInt(str)
		Integer min=0;
		Integer sec=0;
		Integer total=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
			hr = Integer.parseInt(arr[0].replaceAll("[^0-9]", ""));
			System.out.println(hr);
			}if(i==1) {
			min = Integer.parseInt(arr[1].replaceAll("[^0-9]", ""));
			System.out.println(min);
			}if(i==2) {
			sec = Integer.parseInt(arr[2].replaceAll("[^0-9]", ""));
			System.out.println(sec);
			}
			
			total = hr*60+min;
		}
		
		System.out.println(total+"mins and "+sec+"seconds");
	}

}
