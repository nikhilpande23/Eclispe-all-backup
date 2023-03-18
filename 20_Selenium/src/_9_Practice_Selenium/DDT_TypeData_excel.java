package _9_Practice_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_TypeData_excel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("./TestData/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fs);
		wb.getSheet("Sheet1").getRow(0).getCell(1).setCellValue("Nikhil");
		
		FileOutputStream fo=new FileOutputStream("./TestData/TestData.xlsx"); //ask
		wb.write(fo); // ask
		wb.close();
		
	}

}
