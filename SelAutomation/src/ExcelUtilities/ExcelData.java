package ExcelUtilities;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	
	static String filepath;
	static XSSFWorkbook workbook;
	static XSSFSheet Sheet;
	
	
	 public ExcelData(String FilePath, String sheetName){
		
		try {
			FileInputStream fis=new FileInputStream(FilePath);
			 workbook=new XSSFWorkbook(fis);
			 Sheet = workbook.getSheet(sheetName);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("File is not present");
		}	
	}
	
	
	public static void main(String[] args) throws IOException {
		getRowCount();
		getCellData(1,1);
	}

	
	
	public static void getRowCount() throws IOException {
		
		 //filepath=".\\TestExeclData\\countries.xlsx";
//		FileInputStream fis=new FileInputStream(filepath);
//		 workbook=new XSSFWorkbook(fis);
//		 Sheet = workbook.getSheet("Sheet1");
		int rowcount=Sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);	
		
	}
	
	public static void getCellData(int rowNum, int cellNum) throws IOException {
		
//		 //filepath=".\\TestExeclData\\countries.xlsx";
//		FileInputStream fis=new FileInputStream(filepath);
//		workbook=new XSSFWorkbook(fis);
//		 Sheet = workbook.getSheet("Sheet1");
	     String cellData = Sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
	     System.out.println(cellData);
	                      
	}
	
}
