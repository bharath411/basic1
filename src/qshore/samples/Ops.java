package qshore.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ops {

	
	public void launchBrowser(String browser) {
		
		X x ;
		x = new A();
		x = new B();
		
		
		WebDriver driver = null ;
		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			 driver = new ChromeDriver();
		}
		
		
		driver.get("https://github.com/bharath411/basic1");
		
	}
	
	
	public static void main(String[] args) {
	
			
		
		
	
	}
}
