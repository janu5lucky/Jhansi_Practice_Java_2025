package Practice_09012025;

public class Traingle_stars_Pyramids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Star_pyramid_equilateral_triangle();
		//Star_pyramid_Rightside_Rightangle_triangle();
		//Star_pyramid_Rightside_Leftangle_triangle();
		Star_pyramid_equilateral_reverse_triangle();
		
			}

	public static void Star_pyramid_equilateral_triangle() {
		int n=5;
		for (int i=0;i<=n;i++) {


			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				
				System.out.print("* ");

			}
				
			System.out.println();

		}
	}
 
		public static void Star_pyramid_Rightside_Rightangle_triangle() {
			int n=5;
			for (int i=0;i<=n;i++) {


				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println("");


			}
		}
			public static void Star_pyramid_Rightside_Leftangle_triangle() {
				int n=5;
				for (int i=1;i<=n;i++) {


					for(int j=n;j>=i;j--) {
						System.out.print("*");
					}
					System.out.println("");
	

				}
				
			}
			
				public static void Star_pyramid_equilateral_reverse_triangle() {
					int n=5;
					for (int i=0;i<=n;i++) {


						for(int j=1;j<=i;j++) {
							System.out.print(" ");

						}
						for (int k=n-1;k>=i;k--) {
							System.out.print(" *");
		

						}
							
						System.out.println();

					}
				}		
			


	}
	
