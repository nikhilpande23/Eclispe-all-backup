package _2_DDT_FRAMEWORK_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Get data from excel file.

public class _2_excel_file_getData_basic1 {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis= new FileInputStream("./TestData/TestData.xlsx");
		
		Workbook we = WorkbookFactory.create(fis);
		
		Sheet sh = we.getSheet("Sheet1");
		
		Row ro = sh.getRow(1);
		
		Cell cc = ro.getCell(2);
		
		String value = cc.getStringCellValue();
		
		// or
		
		//String value2 = we.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(value);
		
		
	}
	
	

}
