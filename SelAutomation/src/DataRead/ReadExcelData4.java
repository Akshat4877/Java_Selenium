package DataRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData4 {
	
	public static void main(String[] args) throws IOException {
		String filepath=".\\TestExeclData\\countries.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Sheet = wb.getSheet("Sheet1");
		
		int rowcount = Sheet.getLastRowNum();
		short cellcount = Sheet.getRow(1).getLastCellNum();
		
		System.out.println(rowcount);
		System.out.println(cellcount);
		
		for(int r=0; r<=rowcount; r++) {
			
			XSSFRow row = Sheet.getRow(r);
			
			for(int c=0; c<cellcount; c++) {
				
				XSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType()) {
				
				case STRING: 
					System.out.println(cell.getStringCellValue());
					break;
					
				case NUMERIC:
					long numericData=(long)cell.getNumericCellValue();
					System.out.println(numericData);
					break;
					
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				
				}	
				
			}
		}
		
		
	}

}
