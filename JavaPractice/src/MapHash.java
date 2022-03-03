import java.util.HashMap;
import java.util.Map;

public class MapHash {
	
	
	public static void main(String[]args)
	{  
		Map map=new HashMap();
		map.put("Apple", 65000);  
		map.put("HP", 20000);  
		map.put("Dell", 32000);  
		map.put("Asus", 21478);  
		map.put("Samsung", 36546);  
		map.put("Lenovo", 19990);
		
		System.out.println("Originalmap:::");
		map.forEach((k,v)->System.out.println(k+"\t"+v));
		Set<Entry<String, Integer>> entryset = map.entrySet();
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(entryset);
		Collections.sort(list,(o1, o2)->o1.getKey().compareTo(o2.getKey()));
		System.out.println("Originalmap:::");
		list.forEach(s->System.out.println(s.getKey()+"\t"+s.getValue()));
	 }
	}

}
