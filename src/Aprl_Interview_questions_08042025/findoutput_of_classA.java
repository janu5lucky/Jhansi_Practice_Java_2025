package Aprl_Interview_questions_08042025;

public class findoutput_of_classA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		A b = a;
		
		System.out.println(a.i+" "+b.i); // 0 , 0
		a.i = 10 ;
		System.out.println(a.i+" " +b.i); // 10+10 = 20 
		b.i =20;
		
		System.out.println(a.i+" " +b.i);// 10+20 == 30 

	}

}


class A{
	int i;
}