package Project;

public class MethodOverridingChildClass extends MethodOverridingParentClass{
	public void displaycolor() {
		String color="white";
		System.out.println(color);
	}

	public static void main(String[] args) {
		MethodOverridingChildClass obj=new MethodOverridingChildClass();
		obj.displaycolor();
		
		

	}

}
