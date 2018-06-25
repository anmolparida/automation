package PageObjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataFromExcel {
	
	public static void main (String[] args) throws IOException{

		File file = new File("/Users/AnmolParida/Eclipse_Java/TestData/xls_TestFile.xls");

		FileInputStream stream = new FileInputStream(file); 

		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet("TC01");

		for (int i = 0 ;  i <= sheet.getLastRowNum() ; i++){
			HSSFRow row = sheet.getRow(i);

			ArrayList <String>  list = new ArrayList<String>();
			for (int j = 0; j < row.getLastCellNum() ; j++){

				HSSFCell cell = row.getCell(j);
				list.add(cell.getStringCellValue());
			}
			System.out.println(list);
		}
	}
}
