package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelclass {

	XSSFWorkbook wb;
	XSSFSheet sh;

	@Test
	public void excel() throws IOException {

		File location = new File("C:\\Users\\Govin\\OneDrive\\Desktop\\fbData.xlsx");

		// xls=HSSF // format excel
		// .xlsx =XSSF
		FileInputStream fis = new FileInputStream(location); // sending file location//throws an exception so use
																// try
		// loading excel sheet to workbook
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(0); // sheet index 0(1st sheet
		// XSSFSheet sh = wb.getSheet("test"); // test -nam eof excel page
		// String value1=sh.getRow(0).getCell(0).getStringCellValue();
//		int totalrow = sh.getLastRowNum() +1; // to get no of rows
//		// count start form zero(index count)
//		System.out.println("Totol row count" + count);

		//wb.close(); // closing the workbook
	}

	public String getExcelData( int row, int column) throws IOException {
		//sh = wb.getSheetAt(sheet);
		//excel();
		String data=sh.getRow(row).getCell(column).getStringCellValue();
		
		return data;
		
	}
	public int getRows(int sheet) {
		sh = wb.getSheetAt(sheet);
		int totalrow = sh.getLastRowNum() +1;
		return totalrow;
	}
}
