package _9_Practice_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readMultiDataExcel {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "./TestData/TestData2.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		
		Workbook w=WorkbookFactory.create(fis);
		
		int allrow = w.getSheet("Sheet1").getLastRowNum();
		
		for (int i = 1; i < allrow; i++) {
			
			String uname = w.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			String pass=w.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(uname + "--->"+ pass);
		}
		
	}

}
