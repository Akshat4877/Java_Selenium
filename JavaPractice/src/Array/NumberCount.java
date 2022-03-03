package Array;

public class NumberCount {
	public static void main(String[] args) {
		
		//foo(10, 50);
		foo(98);
		
	}

	public static  void foo(int startnum) {
		
		if(startnum<=100) {
			System.out.println(startnum);
			startnum++;
	       foo(startnum);		
		}
		
		
	}
	
	public static  void foo(int startnum, int endvalue) {
	
	if(startnum<=endvalue) {
		System.out.println(startnum);

		startnum++;
       foo(startnum,endvalue);		
	}

}
}