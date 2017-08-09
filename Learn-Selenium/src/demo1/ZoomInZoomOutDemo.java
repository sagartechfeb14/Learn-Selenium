package demo1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomInZoomOutDemo {
	
	WebDriver driver;
	
	@Test
	public void zoomInZoomOut() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='50%'");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%'");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
	

}
