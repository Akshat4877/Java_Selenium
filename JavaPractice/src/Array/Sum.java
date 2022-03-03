package Array;

import java.util.Arrays;

public class Sum {
	
	public static void main(String[] args) {
		

		int[] arr= {1,6,4,5};
        Arrays.sort(arr);
        

		int sum=0;
		for(int i=0; i<arr.length; i++) {
			
			sum=sum+arr[i];
			System.out.println(arr[i]);
          
		}
		System.out.println(sum);

		
	}
}
