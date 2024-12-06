package newproject1;

public class bank {
	public void intrest(int x )
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		axis c=new axis();
		c.intrest(11);
		bank b=new bank();
		b.intrest(12);
	}
	
}
class axis extends bank{
	public void intrest(int x )
	{
		super.intrest(x);
		System.out.println(x);
	}
	
}