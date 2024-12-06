package newproject1;

import java.io.IOException;

public class Demo {
	public void err() 
	{
		try {
			int a=0,b=9;
			System.out.println(b/a); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Exception  has been excempted");
		}
	}
	
	

	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.err();
		
	}

}
;