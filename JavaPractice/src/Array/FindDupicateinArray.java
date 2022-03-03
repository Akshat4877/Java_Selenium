package Array;

import java.util.HashSet;
import java.util.Set;

public class FindDupicateinArray {

	public static void main(String[] args) {
		
		//1.
		//O(n square)
		
		String data[]= {"A","B","C","A","B"};
		
		for(int i=0; i<data.length; i++) {
			
			for(int j=i+1; j<data.length; j++) {
				
				if(data[i].equals(data[j])) {
					System.out.println("1st Method----Duplicate data is :"+data[i]);
				}
			}
			
		}
		
		
		//2.using hashset O(n)-time complexity
		
		Set<String> hashSet=new HashSet<String>();
		
		for(String arraydata: data) {
			
			if(hashSet.add(arraydata)==false) {
				System.out.println("2nd Method----Duplicate Element is :"+arraydata);
			}	
		}	
}

}