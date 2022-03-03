package Akshat;

public class Demo3 {
	
	public static void main(String[] args) {
		
		//sort array without method
		int arr[]= new int[]{11,5,89,98};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				int temp;
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.println(arr[i]);
		}
		
	}

}
