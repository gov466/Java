package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelconfig {
	@Test
	public void excelRead() {
		try {

			File location = new File("C:\\Users\\Govin\\OneDrive\\Desktop\\myexcel.xlsx");

			// xls=HSSF // format excel
			// .xlsx =XSSF
			FileInputStream fis = new FileInputStream(location); // sending file location//throws an exception so use
																	// try
			// loading excel sheet to workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheetAt(0); //sheet index 0(1st sheet
		//	XSSFSheet sh = wb.getSheet("test"); // test -nam eof excel page
			// String value1=sh.getRow(0).getCell(0).getStringCellValue();
			int count=sh.getLastRowNum(); //to get no of rows
			//count start form zero(index count)
			System.out.println("Totol row count"+count);
			
			//for priting all values in sheet 1
			for(int i=0;i<count;i++) {
									//row//colm
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			
			wb.close(); //closing the workbook
			}
			//writing to file
//			sh.getRow(0).createCell(2).setCellValue("fail");
//			sh.getRow(1).createCell(3).setCellValue("fail");
			sh.getRow(0).createCell(2).setCellValue("fail");
			sh.getRow(1).createCell(3).setCellValue("fail");
			
			FileOutputStream fos= new FileOutputStream(location);
			wb.write(fos);
			fos.close();

		} catch (Exception e) {
			System.out.println("exception");
		}
	}
}
