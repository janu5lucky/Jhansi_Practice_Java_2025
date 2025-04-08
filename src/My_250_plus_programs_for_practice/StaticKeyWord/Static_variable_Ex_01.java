package My_250_plus_programs_for_practice.StaticKeyWord;

public class Static_variable_Ex_01 {
	static int count=0;
	Static_variable_Ex_01(){
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_variable_Ex_01 obj = new Static_variable_Ex_01();
		Static_variable_Ex_01 obj2 = new Static_variable_Ex_01();
		System.out.println(Static_variable_Ex_01.count);
	}

}
