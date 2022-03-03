package Constructor;

public class Student {
	
	int id;  
    String name;  
    //creating a parameterized constructor  
    
    Student(int i,String n){  
    id = i;  
    name = n;  
    }
    
    Student(String n){    
        name = n;  
        } 
    
    Student(int i){  
        
        id = i;  
        } 
    
    
    //method to display the values  
    void display(){
    	System.out.println(id+" "+name);
    }  
    
    public static void main(String args[]){  
    //creating objects and passing values  
    Student s1 = new Student(111,"Kuaran");  
    Student s2 = new Student(222,"Aryan");  
    Student s3 = new Student("Aryan");
    Student s4 = new Student(111); 
    //calling method to display the values of object  
    s1.display();  
    s2.display();
    s3.display();
    s4.display();

}
    
}
