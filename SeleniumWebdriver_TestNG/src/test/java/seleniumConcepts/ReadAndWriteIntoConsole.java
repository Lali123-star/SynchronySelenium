package seleniumConcepts;

import java.io.FileInputStream;

public class ReadAndWriteIntoConsole {
public static void main(String[] args) throws Throwable {
		
	FileInputStream fip = new FileInputStream("C:\\Users\\Kiosk_user\\eclipse-workspace\\SeleniumWebdriver_TestNG\\Tester\\Test.txt");
		int data;
		while((data=fip.read())!=-1) {
			System.out.print((char)data);
		}
}
}