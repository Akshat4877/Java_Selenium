package TestNg;

import DataRead.ReadDataMethod;

public class Test {
	
	
public Object[][] getData() {
		
		ReadDataMethod d=new ReadDataMethod("./TestExeclData/SignUpData.xlsx");
		int row=d.getRowNum(0);
		
		Object[][] data=new Object[row][3];
		
		for(int i=1; i<row; i++) {
			String FirstName=d.getExcelData("sheet1", i, 0);
			String LastName=d.getExcelData("sheet1", i, 1);
			String Email=d.getExcelData("sheet1", i, 2);
			String Password=d.getExcelData("sheet1", i, 3);	
			
		}
		return data;
		
		
	}

public static void main(String[] args) {
	
	Test t=new Test();
	System.out.println(t.getData());
	
}

}
