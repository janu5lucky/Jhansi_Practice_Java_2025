package My_250_plus_programs_for_practice.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_propertyFile_Ex_004 {
	public static Properties prop;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void Read_propertyfile() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(System.getProperty("D:\\seleniumfiles\\config.properties"));
			prop.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
