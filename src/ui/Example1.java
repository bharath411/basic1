package ui;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
	}
}
