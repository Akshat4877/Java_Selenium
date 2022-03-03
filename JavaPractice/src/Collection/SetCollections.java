package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollections {
	
	public static void main(String[] args) {
		
		Set set=new HashSet<>();
		
		set.add(null);
		boolean setreturn = set.add("A");
		boolean setreturn1 = set.add("A");
		set.add(null);
		set.add("B");
		System.out.println(setreturn1);
		System.out.println(setreturn);
		System.out.println(set);
		System.out.println("************************");
		java.util.Iterator setdata=set.iterator();
		while(setdata.hasNext()) {
			String data=(String)setdata.next();
			System.out.println(data);
		}
	}

}
