package Synchron.SeleniumTestNg;

import org.testng.ISuite;
import org.testng.ITestNGListener;

public class ListnersEg  implements ITestNGListener{
	 public void onFinish(ISuite suite) {
	    System.out.println("Finishing");
	  }

	  public void onStart(ISuite suite) {
	    System.out.println("Starting");
	  }
	}


