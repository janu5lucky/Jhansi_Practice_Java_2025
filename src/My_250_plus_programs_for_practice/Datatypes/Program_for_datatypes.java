package My_250_plus_programs_for_practice.Datatypes;

public class Program_for_datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte bt = 127;//( 8-bit -128 to 127)
		short st = -32122; //(16-bit -2^15:32768 to 2^15-1:32767 )
		int nt = 1211313; //(32-bit 
		long lg = 1212132123213l ; // 64- bit 
		float ft = 22.123456789f; // 32- bit 
		double db = 2121.323213213232323; // 64-bit
		
		System.out.println("byte : " +bt);
		System.out.println("Short : "+st);
		System.out.println("Integer int : "+nt);
		System.out.println("Long : " +lg);
		System.out.println("Float : :" +ft);
		System.out.println("Double : "+db);
		
		
		/// Type casting
		// Implicit type casting - Widening 
		long longint = nt;
		
		double dbfloat = ft ;
		System.out.println("Int after type casting to long  : "+longint);
		System.out.println("Float after type casting to Double  : "+dbfloat);

		// Explici type casting - narrowing 
		long lint1 = 102902001l;
		int int1 = (int)lint1;
		
		double db1 = 1212121.234556;
		float ft2 = (float)db1;
		
		
		System.out.println("Long after Explicit type casting to Int  : "+int1);
		
		System.out.println("double after Explicit type casting to Float  : "+ft2);

		


		
		

	}

}
