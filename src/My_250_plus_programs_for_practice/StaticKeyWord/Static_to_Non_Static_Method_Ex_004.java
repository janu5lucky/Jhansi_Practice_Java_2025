package My_250_plus_programs_for_practice.StaticKeyWord;

public class Static_to_Non_Static_Method_Ex_004 {

	static void display() {
		System.out.println("Static Method called");
		
	}
	public static void main(String[] args) {
		
		Static_to_Non_Static_Method_Ex_004 obj = new Static_to_Non_Static_Method_Ex_004();
		obj.display();// Not Recomended
		Static_to_Non_Static_Method_Ex_004.display();//Recomended
		

	}

}
