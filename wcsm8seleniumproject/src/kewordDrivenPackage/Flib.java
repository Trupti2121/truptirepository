package kewordDrivenPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.google.common.collect.Table.Cell;

public class Flib {
	
	// it is use to store generic reusable methods..
		// all the methods are Non static

		public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			org.apache.poi.ss.usermodel.Cell cell = row.getCell(cellCount);
			String data = cell.getStringCellValue();
			return data;
		}

		public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
			int rc = sheet.getLastRowNum();
			return rc;
		}


		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);

			org.apache.poi.ss.usermodel.Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);

			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
		}

		public String readPropertyData(String propPath,String key) throws IOException
		{
			FileInputStream fis = new FileInputStream(propPath);

			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
			
		}

}
