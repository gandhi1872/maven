package datadrivenscenarios;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=new FileInputStream("C:\\selenium\\work space\\driven\\testdata\\ReadExcelData.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("test");
		
		for(int i=2;i<=	sheet.getLastRowNum();i++) {
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
		}
		
	}

}
