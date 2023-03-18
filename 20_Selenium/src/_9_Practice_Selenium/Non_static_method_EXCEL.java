package _9_Practice_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Non_static_method_EXCEL {
	
	String Path="./TestData/TestData2.xlsx";
	
	public String nonStaticMethodExcel(String Sheet, int Row, int Cell) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream(Path);
		Workbook wb=WorkbookFactory.create(fs);
		String value = wb.getSheet(Sheet).getRow(Row).getCell(Cell).getStringCellValue();
		return value;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Non_static_method_EXCEL nsm = new Non_static_method_EXCEL();
		String print = nsm.nonStaticMethodExcel("Sheet1", 1, 1);
		System.out.println(print);
	}

}
