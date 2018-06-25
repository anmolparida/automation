package MicrosoftExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main (String [] args) throws IOException{

		//File Path:  /Users/AnmolParida/Eclipse_Java/Concepts.xlsx
		File file = new File("/Users/AnmolParida/Eclipse_Java/EthansTech_Java/TestData/xls_TestFile.xls");

		//FileInputStream : puts a lock on the screen, no other user can work on it simultaneously
		//FileInputStream : to bring data to buffer memory, execution becomes fast. (Reads only used cells not the whole excel)
		FileInputStream stream = new FileInputStream(file); 

		//HSSFWorkbook : To communicate with Excel - external .jar
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet("String");
		System.out.println("getLastRowNum : " + sheet.getLastRowNum());

		HSSFRow row  = sheet.getRow(0);
		System.out.println("getLastCellNum : " + row.getLastCellNum());

		HSSFCell cell = row.getCell(0);
		System.out.println("Cell(0,0) : " + cell.getStringCellValue());

		// Example
		HSSFRow row1  = sheet.getRow(1);	
		HSSFCell cell1 = row1.getCell(1);
		System.out.println("Cell(1,1) : " + cell1.getStringCellValue());

		// Print all Values from the Excel
		System.out.println("--------------------------------");
		System.out.println("Print all Values from the Excel ");
		System.out.println("--------------------------------");

		for (int i = 0 ;  i <= sheet.getLastRowNum() ; i++){
			HSSFRow vRow = sheet.getRow(i);
			for (int j = 0; j < vRow.getLastCellNum() ; j++){
				HSSFCell vCell = vRow.getCell(j);
				//System.out.println("Cell(" + i + "," + j + ") "+ vCell.getStringCellValue());	
				System.out.print(vCell.getStringCellValue() + "\t");	
			}
			System.out.println();
		}
	}
}
