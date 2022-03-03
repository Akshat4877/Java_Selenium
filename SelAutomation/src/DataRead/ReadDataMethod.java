package DataRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataMethod {
	
	
	public XSSFWorkbook workbook;
	public XSSFSheet Sheet;
	
	public ReadDataMethod(String FilePath){
		
		
		try {
				
			FileInputStream fis=new FileInputStream(FilePath);
			 workbook=new XSSFWorkbook(fis);		
		} 
		
		catch (IOException e) {	
			e.printStackTrace();
		}	
	}
	
	
	public String getExcelData(String SheetName, int row, int cell) {
		 Sheet=workbook.getSheet(SheetName);
		 String Data=Sheet.getRow(row).getCell(cell).getStringCellValue();
		 System.out.println(Data);
      	 return Data;		
	}
	
	public int getRowNum(int SheetIndex) {
		int row=workbook.getSheetAt(SheetIndex).getPhysicalNumberOfRows();
		return row;	
	}
	
	
	
	
}
