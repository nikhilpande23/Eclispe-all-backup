package _9_Practice_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Read_MultiData1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/TestData.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		int allrow = wb.getSheet("Sheet1").getLastRowNum();
		
		for (int i = 1; i <= allrow; i++) {
			String r1 = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			String r2=wb.getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();
			
			System.out.println(r1+"--->"+r2);
		}
		
		
	}

}
