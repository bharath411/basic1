package ui.petclinic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExample {
	WebDriver driver = null; 
	String url = "http://localhost:8080/";
	
	public void launchBrowser(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\personal\\selenium-classes\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\personal\\selenium-classes\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	
	public void login(String username,String password) {
		By by1 = By.linkText("Click here");
		WebElement ele = driver.findElement(by1);
		ele.click();
		
		By by2 = By.name("username");
		driver.findElement(by2).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	public void example() {
		By.id("");
		By.name("");
		By.xpath("");
		By.cssSelector("");
		
		By.className("");
		
		By.tagName("");
		By.linkText("");
		By.partialLinkText("");
	}
	
	public static void main(String[] args) {
		FirstExample fe = new FirstExample();
		fe.launchBrowser("chrome");
		fe.login("admin","admin");
	}
	
}
