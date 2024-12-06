 package newproject1;
 
import java.util.*;
public class Fib {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println(a);
		}
		System.out.println(a+" "+b);
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}                    
	}

}
