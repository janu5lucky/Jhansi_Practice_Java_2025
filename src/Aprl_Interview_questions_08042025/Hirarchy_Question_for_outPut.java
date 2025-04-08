package Aprl_Interview_questions_08042025;

public class Hirarchy_Question_for_outPut {
	
public static void main(String[] args) {
	
	Parent p = new Child();
	
	p.massage();// output will be from parent  as we are using static and we cannot ovverride in child class
	
}
	
	
	
	

}
class Parent{
	
	public static void massage() {
		
		System.out.println("This is from parent class");
	}
	
}

class Child extends Parent{
	
	public static void massage() {
		
		System.out.println("This is from Child class");
	}
	
	
}