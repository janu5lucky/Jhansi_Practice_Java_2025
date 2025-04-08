package My_250_plus_programs_for_practice.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Read_txt_file_Ex_005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read_text_file1();
		
	}

	
	public static void read_text_file1() {
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\seleniumfiles\\newfile.txt"))){
			
			String Line;
			while ((Line=br.readLine())!=null) {
				System.out.println(Line);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
