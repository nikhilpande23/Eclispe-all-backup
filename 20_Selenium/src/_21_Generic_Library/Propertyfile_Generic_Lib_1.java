package _21_Generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile_Generic_Lib_1 {
	String path = "./TestData/propertyfile.property";

	public String readDataFromNotepad(String url) throws IOException {
		
	FileInputStream fis=new FileInputStream(path);
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty("url");
	return value;
	}
}
