package Akshat;

import java.util.Arrays;

public class Demo2 {
	
  public static void main(String[] args) {
	
	  int[] arr= new int[]{9,3,5,6,};
	  
      //System.out.println(arr.length);
      
      Arrays.sort(arr);
      int sum=0;
      for(int i=0; i<arr.length; i++) {
    	  System.out.print(arr[i] +" ");
    	  sum=sum+arr[i];	  
      }
      System.out.println("Sum of Arrys is :"+sum);
	    
}

}
