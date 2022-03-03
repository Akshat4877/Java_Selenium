import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class FrequencyArray {
	
	public static void main(String[] args) {

		//int k;
		int a[] = { 2, 3, 4, 4, 4, 3, 7,7, 3 };
		TreeMap<Integer, Integer> list = new TreeMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++)
		{
			if (list.containsKey(a[i]))

			{
				list.put(a[i], list.get(a[i]) + 1);

			}
			else {
				list.put(a[i], 1);
			}
		}
		
		Set<Integer> entrySet= list.keySet();
		
		Iterator<Integer> itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			int key = (int) itr.next();
		
		System.out.println(" no:  " + key + "     frequesncy:   " + list.get(key));
		}
	}
}
