package CoreJava;

public class Final {
	
	int a;

	//The final keyword in java is used to restrict the user.
	 //The java final keyword can be used in many context. Final can be:

      //1.variable
      //2.method
      //3.class
	
	//blank final field
	//final int y;
	//Declare blank final field by constructor
   //	Final(int y){
  //		this.y=y;
  //	}
	
	
	int speedlimit=90;//final variable
	  void run(){
	   speedlimit=400;
	  }
	  
	   int x=10;
	  void chnage() {
		  x=20;
	  }
	
	  
	public static void main(String[] args) {
		
		Final f9=new Final();
		f9.run();
		
	}
				
}

