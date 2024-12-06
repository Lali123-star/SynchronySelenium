package Lists;

import java.util.Vector;

public class vectorEG {

	public static void main(String[] args) {
		Vector<Integer> vc=new Vector<Integer>();
		vc.add(67);
		vc.add(89);
		vc.add(44);
		System.out.println(vc.capacity());
		System.out.println(vc.elementAt(1));
		System.out.println(vc.lastElement());
		System.out.println(vc.firstElement());
		

	}

}
