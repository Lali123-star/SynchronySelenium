package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream reader =new FileInputStream("C://Users//Kiosk_user//eclipse-workspace//collections//configproperties");
       prop.load(reader);
       fin.close();
	}

}
