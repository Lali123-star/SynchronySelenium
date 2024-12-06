package seleniumConcepts;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashList {
public static void main(String[] args) {
		
		//Set<Object> s =new HashSet<Object>(); // insertion order is not  preserved in HashSet
		Set<Object> s =new LinkedHashSet<Object>(); // insertion order is  preserved 
		
		s.add("x");
		s.add("B");
		s.add("C");
		s.add("H");
		s.add("B");
		s.add("C");
		
		
		System.out.println(s.size());
		//s.get();xxxxxxxxxxxxxxxxxxx
		/*
		for(Object x: s) {
			System.out.println(x);
		}
		*/
		Iterator<Object> it = s.iterator();
		while(it.hasNext())
			 System.out.println(it.next());
		
	}

}
