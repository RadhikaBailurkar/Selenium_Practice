//Read Excel values into the console
package Framework;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		//get the location of excel file 
		File src = new File("D:\\Quastech\\testdata.xlsx");
		
		//Read the excel file
		FileInputStream fileip = new FileInputStream(src);
		
		//XLSX file
		Workbook wb = new XSSFWorkbook(fileip);
		
		XSSFSheet sheet1 = (XSSFSheet)wb.getSheetAt(0);
		
		System.out.println(sheet1.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet1.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet1.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet1.getRow(2).getCell(1).getStringCellValue());
		
		
		
		
	}
	

}
