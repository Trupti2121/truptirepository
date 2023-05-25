package readExcelData;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fis2 = new FileInputStream("./data/TestDta.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);   //make the ready to read
		Sheet sheet2 = wb2.getSheet("IPL");      //get into the sheet
		
		int rc = sheet2.getLastRowNum();    //get the last row of table
		
		for(int i=1;i<=rc;i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestDta.xlsx");   //provide the path of desire file
			Workbook wb = WorkbookFactory.create(fis);   //make th efile ready to read
			Sheet sheet = wb.getSheet("IPL");      //get into the file
			Row row = sheet.getRow(i);             //get into the desired row
			Cell cell = row.getCell(0);           //get into the desired cell
			
			String data = cell.getStringCellValue();   //get the value from cell/col
			Thread.sleep(2000);
			System.out.println(data);
		}
	}
}
