
public class SecondHigh {
	
	
	public static void main(String[] args) {
		
		int arr[]= {-1,-2,2,-3,-4};
		int highest=-1;
		int Sechighest=-1;
		
		for(int i=0; i<arr.length; i++) {
			
			int current=arr[i];
			if(highest<current) {
				highest=current;	
			}	
		}
		
         for(int i=0; i<arr.length; i++) {
			
			int current=arr[i];
			
			if(Sechighest<current&&current<highest) {
				Sechighest=current;	
			}	
		}
         System.out.println(" Highest Number is: "+highest);
         System.out.println("Second Highest Number is: "+Sechighest);

		
	}

}
