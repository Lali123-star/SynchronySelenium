package Project;

public class Dog extends Animal{
	
		String color="black";
		public void printcolor() {
			System.out.println(color);
			System.out.println(super.color);
		}

	public static void main(String[] args) {
		Dog oj =new Dog();
		oj .printcolor();
		
		

	}

}
