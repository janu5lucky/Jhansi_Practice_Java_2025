package April_27042025_String_practice;

public class reverse_eachword_String_Ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, Hi! how are you";
		String[] arr = str.split(" ");
		String revword ="";
		String revsentence="";
		for(int i =0;i<arr.length;i++) {
			revword ="";
			for(int j =arr[i].length()-1;j>=0;j--) {
				
				revword =revword+ arr[i].charAt(j);
			}
			revsentence += revword+" ";
		}
		
		
		System.out.println(revsentence);
	}

}
