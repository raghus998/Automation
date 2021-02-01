package data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workbook = new XSSFWorkbook("./data/inputs.xlsx");
		XSSFSheet sh = workbook.getSheet("Sheet1");
		XSSFRow row = sh.getRow(0);
		XSSFCell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}

}
