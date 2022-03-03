package Array;

import java.util.Arrays;

public class Demo {
	
	
	
	public  int[] reverse(int[] array) {
		
		if(array==null|| array.length<=1) {
			System.out.println("Invalid Arrasy");
		}
		
		for(int i=0; i<=array.length/2; i++) {
			
			int temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		
		
		
		return array;
		
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		int[] inputArray= {1,2,3,5};
		System.out.println(Arrays.toString(inputArray));
		System.out.println(Arrays.toString(d.reverse(inputArray)));
		
		
	}

}
