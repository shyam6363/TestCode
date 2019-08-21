package Pratice.All;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class PrintBothColumnsInExcel {
	
public static void main(String args[]) throws IOException{

	FileInputStream inputStream = new FileInputStream ("C:\\Users\\KADIRVELU\\Desktop\\Excel_Practice.xlsx");
	

	@SuppressWarnings("resource")
	XSSFWorkbook workBook = new XSSFWorkbook (inputStream);
	
	XSSFSheet sheet    = workBook.getSheetAt (0);
	Iterator<Row> rows     = sheet.rowIterator ();
	XSSFRow row = null;
	
	while(rows.hasNext()){
		 row = (XSSFRow) rows.next ();

		

	
    Iterator<Cell> cells = row.cellIterator ();
	
	while (cells.hasNext ())
	{
	XSSFCell cell = (XSSFCell) cells.next ();
	System.out.println ("Row No.: " + row.getRowNum ());
	System.out.println ("Cell No.: " + cell.getColumnIndex());
	
	CellType type=cell.getCellTypeEnum();
	
	switch(type){
	
	case NUMERIC :
		
		    {
		        // cell type numeric.
		        System.out.println ("Numeric value: " + cell.getNumericCellValue ());
		        break;
		    }
		
		    case STRING :
		
		    {
		
		        // cell type string.
		
		        XSSFRichTextString richTextString = cell.getRichStringCellValue ();
		
		        System.out.println ("String value: " + richTextString.getString ());
		
		        break;
		    }
		
		    default :
		
		    {
		        System.out.println ("Type not supported.");
		        break;
		    }

		
	}
}
}
}
}


	
  

	
	


