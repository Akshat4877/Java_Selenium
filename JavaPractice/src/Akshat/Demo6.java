package Akshat;

public class Demo6 {
	
	public static void main(String[] args) {
		
		int[] arr= {1,4,6,7,8};
		int higest=-1;
		int sechigest=-1;
		
		for(int i=0; i<arr.length; i++) {
			
			int current=arr[i];
			if(higest<current) {
				higest=current;
			}
			
		}
       for(int i=0; i<arr.length; i++) {
			
			int current=arr[i];
			if(sechigest<current&&current<higest) {
				sechigest=current;
			}
			
		}

System.out.println(higest);
System.out.println(sechigest);
		
		
		
	}

}
