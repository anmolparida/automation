package MicrosoftExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcel {



	public static void main (String [] args) throws IOException{


		File file = new File("/Users/AnmolParida/Eclipse_Java/EthansTech_Java/TestData/xls_TestFile.xls");

		FileInputStream stream = new FileInputStream(file); 

		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet("String");
		//HSSFRow vRow = sheet.getRow(0);
		//HSSFCell vCell = vRow.getCell(0);


		HSSFRow row = sheet.createRow(4); 
		sheet.getRow(4); // optional
		HSSFCell cell = row.createCell(4);
		cell.setCellValue("New Entry");
		
		FileOutputStream outstream = new FileOutputStream(file);
		workbook.write(outstream);
	}
}
