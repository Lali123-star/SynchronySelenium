package seleniumConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteintoAFile {
public static void main(String[] args) throws Throwable {
		
		FileInputStream fip=new FileInputStream(new File("C:\\\\Users\\\\Kiosk_user\\\\eclipse-workspace\\\\SeleniumWebdriver_TestNG\\\\Tester\\\\Test.txt"));
		FileOutputStream fop=new FileOutputStream("NewFile.txt");
		
		int data;
	    while((data=fip.read())!=-1) {
	    	//System.out.print((char)data);
	    	fop.write(data);
	    }
	    
	    System.out.println("Done");
	}
}