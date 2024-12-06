package Project;

public class EncapsulationEg {
	private String Name ;
	private int id;
	public void getname() {
		System.out.println(Name);
	}
	public void setname(String n) {
		this.Name=n;
	}
	public void setid(int i) {
		this.id=i;
	}
	public static void main(String[] args) {
		EncapsulationEg hj= new EncapsulationEg();
		hj.setname("ravi");
		

	}

}
