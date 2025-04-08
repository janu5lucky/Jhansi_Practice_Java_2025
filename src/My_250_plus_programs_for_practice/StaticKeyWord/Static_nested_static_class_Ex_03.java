package My_250_plus_programs_for_practice.StaticKeyWord;

public class Static_nested_static_class_Ex_03 {

	static int data =30;
	
	static class Inner{
		void show() {
			System.out.println("Data : "+data);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_nested_static_class_Ex_03.Inner obj = new Static_nested_static_class_Ex_03.Inner();
		obj.show();
		

	}

}
