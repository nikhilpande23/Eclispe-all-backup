package _2_DDT_FRAMEWORK_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// write a script to create a non static method to the read data from excel sheet.

public class _31_NonStaticMethodOfExcel_DDT {
	
	String path="./TestData/TestData2.xlsx";
	
	public String readDataFromExcel(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		String value = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;	
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		_31_NonStaticMethodOfExcel_DDT ns=new _31_NonStaticMethodOfExcel_DDT();
		String data=ns.readDataFromExcel("Sheet1", 1, 0);
		System.out.println(data);
	}
	
	
}
