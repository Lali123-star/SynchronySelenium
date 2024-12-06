package Project;

public class Methodoverloading {
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a, int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public void add(int a, int b, int c, int d) {
		int e =a+b+c+d;
		System.out.println(e);
	}

	public static void main(String[] args) {
		Methodoverloading sd=new Methodoverloading();
		sd.add(6, 9);
		sd.add(6, 9, 8);
		sd.add(6, 9, 8, 6);

	}

}
