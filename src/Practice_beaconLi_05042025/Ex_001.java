package Practice_beaconLi_05042025;

import java.util.Arrays;

public class Ex_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String[][] arr = {{"year:1983", "won:1"},
		                          {"year:1987", "won:0"},
		                          {"year:1991", "won:0"},
		                          {"year:2007", "won:1"},
		                          {"year:2011", "won:1"},
		                          {"year:2015", "won:0"},
		                          {"year:2019", "won:0"},
		                          {"year:2023", "won:0"},
		                          {"year:2023", "won:1"}};
		    String[] yes = new String[arr.length];
		    String[] no = new String[arr.length];
		    for (int i = 0;i<arr.length-1;i++){
		            if(arr[i][1]== "won:1"){
		              yes[i]= yes+arr[i][0];
		              // String s= yes[i].toString().replaceAll("^[a-z]","");
		               // yes[i].toString().replaceAll("^[0-9]","");
		            }else {
		                no[i]= no+arr[i][0];
		            }
		        }

		        System.out.println("Yes"+Arrays.toString(yes));
		        System.out.println("No"+Arrays.toString(no));

		    }



		    }
