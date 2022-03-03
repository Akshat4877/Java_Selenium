
public class SecondHighest {
	
	public static void main(String[] args) {
		int[] ar = {1,2,10,11,8,9,22};
		int highest = -1;
		int secHigest = -1; //ar[1]
		for (int i = 0; i  < ar.length; i++)
		{
		    int current = ar[i];
		    
		    if(highest <  current)
		    {
		        highest = current;
		    } //end of  if
		} 
		
		for (int i = 0; i  < ar.length; i++)
		{
		    int current = ar[i];
		    if(secHigest <  current && current <  highest){
		        secHigest = current;
		    } //end of  if  
		} 
		System.out.println(highest  + " === "+secHigest);
	}

}
