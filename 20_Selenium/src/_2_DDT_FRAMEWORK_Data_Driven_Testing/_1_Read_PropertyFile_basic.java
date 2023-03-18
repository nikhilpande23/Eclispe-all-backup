package _2_DDT_FRAMEWORK_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class _1_Read_PropertyFile_basic {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/propertyfile.property");
		
		Properties p=new Properties();
		p.load(fis);
		
		String gf = p.getProperty("password");
		System.out.println(gf);
	}

}
