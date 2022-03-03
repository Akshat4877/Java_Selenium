package Collection;
import java.util.*;  

class GFG {
	 
    // Main driver method
    public static void main(String[] args)
    {	
        //Creating an object of List interface
         //implemented by the ArrayList class
         
    	List l1=new ArrayList();
    	
        //Adding elements to object of List interface
        //Custom inputs
        l1.add(1);
        l1.add(2);
        l1.add("Santa");
        l1.add(1, "New data");
        l1.set(0, "Data");
        System.out.println("Data on 0th Index is "+l1.get(0)); 
        // Print the elements inside the object
        System.out.println(l1);
        
        l1.remove(3);
        System.out.println(l1);
        int collectionSize=l1.size();
        System.out.println("Array List Size is "+collectionSize);
        
        
 
        // Now creating another object of the List
        // interface implemented ArrayList class
        // Declaring object of integer type
        List<Integer> l2 = new ArrayList<Integer>();
       // Again adding elements to object of List interface
      // Custom inputs
          l2.add(1);
//        l2.add(2);
//        l2.add(3);
// 
//        // Will add list l2 from 1 index
//        l1.addAll(1, l2);
// 
//        System.out.println(l1);
// 
//        // Removes element from index 1
//        l1.remove(1);
// 
//        // Printing the updated List 1
//        System.out.println(l1);
// 
//        // Prints element at index 3 in list 1
//        // using get() method
//        System.out.println(l1.get(3));
// 
//        // Replace 0th element with 5
//        // in List 1
//        l1.set(0, 5);
// 
//        // Again printing the updated List 1
//        System.out.println(l1);
    }
}

