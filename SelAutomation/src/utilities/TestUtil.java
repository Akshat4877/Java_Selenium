package utilities;

import java.io.IOException;
import java.util.ArrayList;

import ExcelUtilities.ExcelData;
 



public class TestUtil {
	
	
	public static void main(String[] args) throws IOException {
		ExcelData obj=new ExcelData(".\\TestExeclData\\countries.xlsx","Sheet1");
		obj.getRowCount();
		obj.getCellData(1, 1);
		
	}
	
	
	}
	
	
	


