package ui;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 {

	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver","D:\\personal\\selenium-classes\\jars\\geckodriver.exe");
		FirefoxDriver driver  = new FirefoxDriver();
		driver.get("http://www.facebook.com/");
	}
	
	public static void main(String[] args) {
		Example2 ex = new Example2();
		ex.launchBrowser();
	}
}
