package _2_DDT_FRAMEWORK_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class _11_Read_PropertyFile_basic {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/propertyfile.property");
		
		Properties p = new Properties();
		p.load(fis);
		
		String URL1=p.getProperty("url");
		String USERNAME1=p.getProperty("username");
		String PASSWORD1=p.getProperty("password");
		System.out.println(URL1);
		System.out.println(USERNAME1);
		System.out.println(PASSWORD1);
	}

}

