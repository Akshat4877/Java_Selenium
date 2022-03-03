package DataRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;


public class ReadExcel { 
	
	public static void main(String[] args) throws IOException {
		String filepath=".\\TestExeclData\\countries.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Sheet = wb.getSheet("Sheet1");
		int rowcount=Sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		
		
		 String data0 = Sheet.getRow(0).getCell(0).getStringCellValue();
		 System.out.println(data0);
		 
		 String data10 = Sheet.getRow(0).getCell(1).getStringCellValue();
		 System.out.println(data10);
		 
		 String data11 = Sheet.getRow(0).getCell(2).getStringCellValue();
		 System.out.println(data11);
		 
		 
		 String data1 = Sheet.getRow(2).getCell(1).getStringCellValue();
		 System.out.println(data1);
		 
		 long data2 = (long) Sheet.getRow(2).getCell(2).getNumericCellValue();
		 System.out.println(data2);
		 
		 wb.close();
		
		
	}
	
}
