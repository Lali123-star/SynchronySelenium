package Project;

public class Exceptionhandling4 {
	public void arthexp() {
	try {
		int i=100/0;
	}
	catch(ArithmeticException e ) {
		e.printStackTrace();
		
		
	}
	}
	
	

	public static void main(String[] args) {
		Exceptionhandling4 ng=new Exceptionhandling4();
		ng.arthexp();

	}

}
