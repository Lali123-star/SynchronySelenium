package Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEG {

	public static void main(String[] args) {
		ArrayList<String> list=new  ArrayList<String>();
		list.add("Jogh");
		list.add("Jogh");
		list.add("Ramya");
		list.add("Ramya");
		list.add("Reema");
		list.add(null);
		System.out.println(list);
		list.remove(1);
		list.contains("Jogh");
		System.out.println(list.size());
		Iterator itr =list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
		
	}
	}

}
