package Collection;
import java.util.*;  


public class Demo {
	
	 public static void main(String args[]){  
		  ArrayList list=new ArrayList();//Creating arraylist    
		      list.add("Mango");//Adding object in arraylist    
		      list.add("Apple");    
		      list.add("Banana");    
		      list.add("Grapes");
		      list.add("Mango");
		      list.add(null);
		      list.add(null);
		      
		      System.out.println(list);
		      
		      for(Object data1: list) {
		    	  System.out.println(data1);
		      }
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
//		     Iterator itr=list.iterator();
//		     while(itr.hasNext()) {
//		    	 Object data=itr.next();
//		    	 System.out.println(data);
//		    	 if(data.equals("Banana")) {
//		    		 
//		    		 System.out.println("yooooooooooooooooooooo it is BANANA");
//		    		 break;
//		    		 //continue;
//		    		 
//		    	 }
//		    	 
//		    	 else {
//		    		 System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOO");
//		    	 }
//		     }
		      
		 }  

}
