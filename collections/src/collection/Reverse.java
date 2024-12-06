package collection;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=s.nextLine();
		String arr[]=str.split(" ");
		String rev="";
		for(String ss:arr) {
			StringBuilder b=new StringBuilder(ss);
			rev+=b.reverse().toString()+" ";
		}
		System.out.println(rev);
		}

	}


