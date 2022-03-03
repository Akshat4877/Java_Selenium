
public class DoWhile {
	
	public static void main(String[] args) {
		
		int i=10;
		
		do {
			System.out.println(i);
			i++;
			if(i==5) {
				continue;
			}
		}
		while(i<6); {
			System.out.println("While loop");
		}
		
		
	}

}
