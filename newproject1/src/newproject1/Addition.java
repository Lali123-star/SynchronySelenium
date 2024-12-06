package newproject1;

public class Addition {
	public static void main(String args[]) 
	{
		Addition a=new Addition();
		a.add(10,20);
		a.add(10,20,30);
		a.add(10,20.0);
		
		
		System.out.println();
	}
	public void add(int x,int y)
	{
		System.out.println("Adding 2 numbers="+(x+y));
	}
	public void add(int x,int y,int z)
	{
		System.out.println("Adding 3 numbers="+ (x+y+z));
	}
	public void add(int x,double y)
	{
		System.out.println("Adding 2 numbers="+ (x+y));
	
	}

}
