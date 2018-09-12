package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example3 {

	public void launchBrowser(String browser) {
		WebDriver driver = null; 
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\personal\\selenium-classes\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("http://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public static void main(String[] args) {
			Example3 ex = new Example3();
			ex.launchBrowser("firefox");
	}
}
