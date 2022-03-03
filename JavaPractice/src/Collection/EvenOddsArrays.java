package Collection;

public class EvenOddsArrays {
	
	public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
	
	
	public static void main(String[] args) {
		
		
		int n=6;
		int[] Data= {1,4,4,9,67,21};
		
		int EvenSize=0;
		int OddSize=0;
		
		for(int i=0; i<n; i++) {
			
			if(Data[i]%2==0) {
				EvenSize++;
			}
			else {
				OddSize++;
			}
			
		}
		
		//define two arrays
		int [] EvenArray=new int[EvenSize];
		int [] OddArray=new int[OddSize];
		
		
		for(int i=0; i<n; i++) {
			
			int j=0; int k=0;
			if(Data[i]%2==0) 
				EvenArray[j++]=Data[i];
			else
				OddArray[k++]=Data[i];
			
			System.out.println("Even Arrys is ");
			printArray(EvenArray);
			System.out.println("Odd Arrys is ");
			printArray(OddArray);
		}
		
		
	}

}
