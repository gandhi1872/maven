package datadrivenscenarios;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String filepath = System.getProperty("user.dir")+"\\testdata\\OrangeHRM_TestCases.xlsx";
		String sheetname = "hrm";
		
		File f=new File(filepath);
		FileInputStream fis=new FileInputStream(f);
		
		Workbook Wb = null;
		org.apache.poi.ss.usermodel.Sheet Sh = null;
		Row row = null;
		Cell cell = null;
		
		if(filepath.endsWith(".xls"))
			Wb = new HSSFWorkbook(fis);
		else if(filepath.endsWith(".xlsx"))
			Wb = new XSSFWorkbook(fis);
		
		Sh = Wb.getSheet(sheetname);
		System.out.println(Sh.getLastRowNum());
		
		row = Sh.getRow(4);
		cell = row.getCell(2);
		System.out.println(cell.getStringCellValue());
		
		
			
		
		
	}

}
