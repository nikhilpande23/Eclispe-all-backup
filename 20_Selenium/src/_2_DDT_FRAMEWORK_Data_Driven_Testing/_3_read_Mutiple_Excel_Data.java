package _2_DDT_FRAMEWORK_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// write script to read multiple data from excel sheet.

public class _3_read_Mutiple_Excel_Data {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/TestData2.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		
		int rowcount = wb.getSheet("Sheet1").getLastRowNum(); // Last Row num
		
		for (int i = 1; i <= rowcount; i++) {
			
			String ub=wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			String pass=wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue(); 
			
			System.out.println(ub+"--->"+pass);
			
		}
		
		wb.close();
				
	}

}
