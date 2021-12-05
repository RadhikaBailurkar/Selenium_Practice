package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		File src = new File("D:\\Quastech\\testdata.xlsx");
		FileInputStream fileip = new FileInputStream(src);
		
		Workbook wb = new XSSFWorkbook(fileip);
		
		XSSFSheet sheet1 = (XSSFSheet)wb.getSheetAt(0);
		
		FileOutputStream fo = new FileOutputStream(src);
		sheet1.getRow(0).createCell(2).setCellValue("city");
		sheet1.getRow(1).createCell(2).setCellValue("Mumbai");
		sheet1.getRow(2).createCell(2).setCellValue("Delhi");
		sheet1.getRow(3).createCell(2).setCellValue("Pune");
		sheet1.getRow(4).createCell(2).setCellValue("Chennai");
		sheet1.getRow(5).createCell(2).setCellValue("Banglore");
		sheet1.getRow(6).createCell(2).setCellValue("Ooty");
		
		wb.write(fo);
		System.out.println("Data Saved");
	}

}
