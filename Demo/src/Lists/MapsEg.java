package Lists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsEg {

	public static void main(String[] args) {
		Map  map=new HashMap();
		map.put(1, "Rani");
		map.put(2, "Amit");
		map.put(3, "Raj");
		map.put(4,"ram");
		Set set=map.entrySet();
		Iterator itr =set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry =(Map.Entry)itr.next();
			System.out.println(entry.getKey()+""+entry.getValue());
			
		}
		
	}

}
