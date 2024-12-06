package Project;

public class AbstractChildclass extends AbstractED {


	@Override
	
	void read() {
		System.out.println("displaying in the Class");
		
		
	}

	public static void main(String[] args) {
		
		AbstractChildclass obj= new AbstractChildclass();
		obj.read();
		
		obj.display();

	}

}
