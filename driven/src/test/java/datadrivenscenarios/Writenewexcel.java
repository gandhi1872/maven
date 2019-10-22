package datadrivenscenarios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writenewexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String filepath = System.getProperty("url.dir")+"\\testdata\\OrangeHRM_TestCases.xlsx";
		
		File f = new File(filepath);
		
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		
		if(filepath.endsWith(".xls"))
		  wb = new HSSFWorkbook();
		else if(filepath.endsWith(".xlsx"))
		  wb = new XSSFWorkbook();
		 
		  sh = wb.createSheet("TestDataSheet");
		  
		  for(int i=0; i<10; i++) {
			  row = sh.createRow(i);
	      for(int j=0; j<10; j++);
	      
	      cell.setCellValue("Testdata+i+j");
	      
		  }
			FileOutputStream os = new FileOutputStream(f);
			wb.write(os);
			wb.close();
		
	}

}
