package Pratice.All;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpecificColumnInExcel {

	public static void main(String args[]) throws IOException{
		FileInputStream inputStream = new FileInputStream ("C:\\Users\\KADIRVELU\\Desktop\\Excel_Practice.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook (inputStream);
		XSSFSheet sheet    = workBook.getSheetAt (0);
		for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
			  XSSFRow row = sheet.getRow(rowIndex);
			  if (row != null) {
			    XSSFCell cell = row.getCell(0);
			    if (cell != null) {
			      // Found column and there is value in the cell.
			         System.out.println(cell.getStringCellValue());
			      // Do something with the cellValueMaybeNull here ...
			    }
			  }
			}
		
	}
}
	

		
	


