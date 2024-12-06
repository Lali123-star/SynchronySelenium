package collection;

import java.util.Scanner;

public class Prime {

	//public static void main(String[] args) {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
					System.out.println("Enter a number to chech prime or not");
					int prime=s.nextInt();
					boolean flag=true;
					for(int i=2;i<=prime/2;i++) {
						if(prime%i==0) {
							flag=false;
						}
					}
					if(flag)
					{
						System.out.println("Prime");
					}
					else {
						System.out.println("Not Prime");
					}

	}

}
