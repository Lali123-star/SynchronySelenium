package newproject1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Col {
	

		public static void main(String[] args) {
			System.out.println("Elements in Linked List");
			List<String> l1=new ArrayList<>();
			List<String> l2=new ArrayList();
			l1.add("Red");
			l1.add("Green");
			l1.add("Black");
			l1.add("White");
			l2.add("Red");
			l2.add("Green");
			l2.add("Black");
			l2.add("White");
			Iterator itr=l1.iterator();
			while(itr.hasNext())
			{
				Object o=itr.next();
				System.out.println(l2.contains(o));
			}
		}
	}
			
					


