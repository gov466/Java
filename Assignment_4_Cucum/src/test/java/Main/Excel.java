package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	@Test
	public String excel_R() throws IOException {

		File loc = new File("C:\\Users\\Govin\\Downloads\\resolvelink.xlsx");

		FileInputStream fis = new FileInputStream(loc); // sending file location//throws an exception so use
		// try
// loading excel sheet to workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0); // sheet index 0(1st sheet
		String value1=sh.getRow(0).getCell(0).getStringCellValue();
		
		//System.out.println(value1);
		wb.close();
		return value1;
	}

}
