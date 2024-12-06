package Lists;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEG {

	public static void main(String[] args) {
		HashSet<Float> hs = new HashSet<Float>();
		hs.add(67.7f);
		hs.add(23.1f);
		hs.add(56.f);
		Iterator itr=hs.iterator();
		
			System.out.println(itr.hasNext());
		}
		

	}


