package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenFirefox {

	WebDriver driver;
	@Test
	public void openFirefox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Selenium\\drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.manage().window().setSize(new Dimension(1920, 1080));
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		}
	}

	
