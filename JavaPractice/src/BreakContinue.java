
public class BreakContinue {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i==10) {
				//break; //1,2,3,4
				continue; //1,2,3,4,6,7,8,9,10
			}
			System.out.println(i);	
		}	
	}
}
