package newproject1;
import java.io.*;
import java.util.*;

public class FileHandling {

	public static void main(String[] args) throws IOException { 
	     File f=new File("C:\\Users\\Kiosk_user\\Downloads\\training/Trainig.txt");
	     if(f.exists()) {
	     System.out.println("File Is Created");
	     //f.createNewFile();
	    // System.out.println(f.getAbsolutePath());
	     Scanner s=new Scanner(f);
	     while(s.hasNext())
	     {
	    	 System.out.println(s.nextLine());
	     }
	}else {
		 
	   
	     
	     

	
