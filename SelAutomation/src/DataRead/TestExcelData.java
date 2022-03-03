package DataRead;

public class TestExcelData {
	
	public static void main(String[] args) {
		ReadDataMethod RED=new ReadDataMethod(".\\TestExeclData\\countries.xlsx");
		RED.getExcelData("Sheet1", 0, 0);
		
	}

}
