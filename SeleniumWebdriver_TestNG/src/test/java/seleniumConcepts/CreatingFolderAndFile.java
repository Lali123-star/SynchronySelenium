package seleniumConcepts;

import java.io.File;

public class CreatingFolderAndFile {
public static void main(String[] args) throws Throwable {
		
		File f =new File("Tester\\Test.txt");
		f.createNewFile();
//		C:\Users\Kiosk_user\eclipse-workspace\SeleniumWebdriver_TestNG\Tester
		System.out.println("Done");
		// escape character
		//String str="Srinivas is \"selenium\" Training";
		//System.out.println(str);
		
	}
}
