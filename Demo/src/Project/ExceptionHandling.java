package Project;

public class ExceptionHandling {
	public void nulldisplay() {
	
	try {
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		ExceptionHandling ob=new ExceptionHandling();
		ob.nulldisplay();

	}

}

