package newproject1;

public class office implements Cab,Bike,Bus {
	
	
	

	public static void main(String[] args) {
            office o=new office();
            o.journeyByBus();
            o.journeyByBike();
            o.journeyByCab();
            
            

	}

	@Override
	public void journeyByBus() {
		System.out.println("JourneyByBus");
		
	}

	@Override
	public void journeyByBike() {
		System.out.println("JourneyByBike");
		
		
	}

	@Override
	public void journeyByCab() {
		System.out.println("JourneyByCab");
		
		
	}

}
