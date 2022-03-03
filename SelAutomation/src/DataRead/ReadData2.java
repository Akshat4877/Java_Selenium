package DataRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData2 {
	
	public static void main(String[] args) throws IOException {
		
		String filepath=".\\TestExeclData\\countries.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Sheet = wb.getSheet("Sheet1");
		int rowcount=Sheet.getLastRowNum();
		System.out.println("Total row count is :"+rowcount);
		for(int i=0; i<=rowcount; i++) {
		String rowData = Sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Data from row "+ i +" is "+rowData);		
		}
}

}