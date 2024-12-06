package selenium;

import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
public static void main(String[] args) {
	WebDriver d=new EdgeDriver();
	d.get("https://www.bing.com/search?q=google.comm&cvid=0af61a22730b4f13b8bc6be4026a4368&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQABhAMgYIAhAuGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEDSAQgzODQ5ajBqMagCALACAA&FORM=ANNTA1&PC=U531");
	
}
}
