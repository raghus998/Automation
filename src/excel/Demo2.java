package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/INPUT.xls");
		 Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet("Sheet1");
		  int rc = sh.getLastRowNum();
		  for (int i = 0; i <=rc; i++) {
			 short cc = sh.getRow(i).getLastCellNum();
			 for (int j = 0; j <cc; j++) {
				 String value = sh.getRow(i).getCell(j).getStringCellValue(); 
				 System.out.print(value+" "  );
			}
			 System.out.println();
		}
	}
}
