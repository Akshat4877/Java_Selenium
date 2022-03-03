

//with out using loop

public class A {
	
	public static void main(String[] args) {
		
		//foo(10, 50);
		foo(1);
		//hello();
		
	}
	
	public static void hello() {
		
   if(System.out.printf("Hello Word")==null) {
			
   }
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
