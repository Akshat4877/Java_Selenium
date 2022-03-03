package Array;

import java.util.Arrays;

public class ArrayReverse {
	
	 public int[] reverse(int[] array){

	        if(array == null || array.length <= 1){
	            System.out.println("Invalid array.");
	        }
	        
	        for (int i = 0; i < array.length / 2; i++) {
	            int temp = array[i];
	            array[i] = array[array.length - 1 - i];
	            array[array.length - 1 - i] = temp;
	        }
	        
	        return array;
	    }
	 
	 public static void main(String[] args){

		  ArrayReverse reverseArray=new ArrayReverse();
		  int inputArray[]={1,6,8,2};
		  System.out.println("Original Array "+Arrays.toString(inputArray));
		    System.out.println("Reverse Array "+Arrays.toString(reverseArray.reverse(inputArray)));
		}
}
