package _21_Generic_Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Generic_Lib_1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	String path = "./TestData/TestData2.xlsx";
	/**
	 * 								//  goto " " class for next execution.
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	String value = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	return value;
}
/**
 * 
 * @param SheetName
 * @param row
 * @param cell
 * @param setvalue
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	
	public void writeDataToExcel(String SheetName, int row, int cell, String setvalue) throws EncryptedDocumentException, IOException{
	FileInputStream fis= new FileInputStream(path);
	Workbook we = WorkbookFactory.create(fis);
	we.getSheet(SheetName).getRow(row).getCell(cell).setCellValue(setvalue);
	FileOutputStream fo = new FileOutputStream(path);
	we.write(fo);
	}
}

