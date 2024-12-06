package seleniumConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteAsAnImage {
public static void main(String[] args) throws Throwable {
		
		FileInputStream fip=new FileInputStream(new File("D:\\pexels-photo-1324803.jpeg"));
		FileOutputStream fop=new FileOutputStream("NewImg.png");
		
		int data;
	    while((data=fip.read())!=-1) {
	    	//System.out.print((char)data);
	    	fop.write(data);
	    }
	    
	    System.out.println("Image Copied");
}
}