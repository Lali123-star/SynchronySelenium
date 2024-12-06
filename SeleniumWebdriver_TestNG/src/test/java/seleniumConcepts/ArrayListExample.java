package seleniumConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
		
		List<Object> ar =new ArrayList<Object>();//insertion order is preserved
		
		ar.add("C");
		ar.add("B");
		ar.add("C");
		ar.add("H");
		ar.add("B");
	
		System.out.println(ar.size());
		//System.out.println(ar.get(2));
		/*
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		for(Object x: ar) {
			System.out.println(x);
		}
		*/
		Iterator<Object> it = ar.iterator();
		/*
		for(int i=0;i<4;i++) {
			it.next();
		}
			System.out.println(it.next());
			*/
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
