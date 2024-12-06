package seleniumConcepts;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Image2 {
	public static void main(String[] args) throws Throwable {
		long start = System.currentTimeMillis();
		FileReader fip=new FileReader(new File("C:\\Users\\Shrinivas\\Pictures\\Flowers.jpg"));
		FileWriter fop=new FileWriter("NewImg2.png");
		
		int data;
	    while((data=fip.read())!=-1) {
	    	//System.out.print((char)data);
	    	fop.write(data);
	    }
	    
	    System.out.println("Done");
		long stop = System.currentTimeMillis();
		System.out.println("Total time ="+(stop-start));
	}
}
