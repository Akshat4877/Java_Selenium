package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		List LL=new LinkedList<>();
		LL.add(1);
		LL.add(2);
		LL.add(3);
		LL.add(4);
		LL.add(3);
		System.out.println(LL);
		
		Iterator itr=LL.iterator();
		while(itr.hasNext()) {
			Integer data=(Integer)itr.next();
			System.out.println(data);			
			if(data%2==0) {
				System.out.println("Even");
			}
			else if(data%2!=0){
				System.out.println("Odds");
			}
			
		
		
		}
	}

}
