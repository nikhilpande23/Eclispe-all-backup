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


public class _21_excel_file_getData_basic2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fs= new FileInputStream("./TestData/TestData.xlsx");
		
		Workbook we = WorkbookFactory.create(fs);
		
		String value = we.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(value);
	}
}
