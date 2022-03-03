package Akshat;

public class Demo55 {
	
	public static void main(String[] args) {
		
		int[] arr= {1,4,4,5,7};
		int[] fr= {-1,-1,-1,-1};
		
		for(int i=0; i<arr.length; i++) {
			
			int count=1;
			for(int j=i+1; i<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=0;
				}
			}
			
			if(fr[i]!=0) {
				fr[i]=count;
				System.out.println(fr[i]);
						
			}
			
		}
		
		
	}

}
