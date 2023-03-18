package _2_DDT_FRAMEWORK_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _22_excel_file_TypeData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//get data into program
		FileInputStream fis= new FileInputStream("./TestData/TestData.xlsx"); 
		
		Workbook we = WorkbookFactory.create(fis);
		
		we.getSheet("Sheet1").getRow(1).getCell(3).setCellValue("Pharma");
		
		//get Change data into TestData excel file.
		FileOutputStream fo = new FileOutputStream("./TestData/TestData.xlsx"); 
		
		we.write(fo);
		 we.close();
		
	
	
	
	
	}
	
}
