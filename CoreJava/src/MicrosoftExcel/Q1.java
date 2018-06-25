package MicrosoftExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class Q1 {


	public static void main (String [] args) throws IOException{


		File file = new File("/Users/AnmolParida/Eclipse_Java/EthansTech_Java/TestData/xls_TestFile.xls");

		FileInputStream stream = new FileInputStream(file); 

		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet("Integer");
		//HSSFRow vRow = sheet.getRow(0);
		//HSSFCell vCell = vRow.getCell(0);

		ArrayList <Double>  obj = new ArrayList<Double>();

		for (int i = 0 ;  i <= sheet.getLastRowNum() ; i++){
			HSSFRow vRow = sheet.getRow(i);
			for (int j = 0; j < vRow.getLastCellNum() ; j++){
				HSSFCell vCell = vRow.getCell(j);
				obj.add(vCell.getNumericCellValue());

			}
		}
		for(int k = 0 ; k < obj.size(); k++){
			System.out.print(obj.get(k) + "\t");
		}

		
		/*
		System.out.println("Sorting Below");
		System.out.println("_______________");
		
		double temp;
		for (int m = 0; m < obj.size(); m++){
			for (int n = m+1 ; n< obj.size() ; n++){
				if(obj.get(m) > obj.get(m) ){
					temp = obj.get(n) ;
					obj.add(n, obj.get(m));
					obj.add(m,temp);
				}	
			}
		}
		
		for(int k = 0 ; k < obj.size(); k++){
			System.out.print(obj.get(k) + "\t");
		}
		*/
		
		Collections.sort(obj);
		System.out.println();
		System.out.println("______________________________");
		System.out.print("Using Collection.sort(obj) : " + obj);

		HSSFRow xRow = sheet.createRow(10);
		
		for (int i = 0 ; i< obj.size(); i++){
			HSSFCell xCell = xRow.createCell(i);
			xCell.setCellValue(obj.get(i));
		}
		FileOutputStream os = new FileOutputStream(file);
		workbook.write(os);
		
	}
}