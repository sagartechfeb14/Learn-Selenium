package demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TakeScreenshotForHeadlessBrowser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		
		//working with headless browser
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.addArguments("window-size=1400,800");
		chromeOptions.addArguments("headless");
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		driver.get("http://automationtesting.in");
		System.out.println("Site Title is=="+driver.getTitle());
		driver.findElement(By.cssSelector("#s")).sendKeys("testng");
		driver.findElement(By.cssSelector("#s")).sendKeys(Keys.ENTER);
		System.out.println("Site Title is=="+driver.getTitle());
		
		//Taking Screenshot code
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String dest= "C:\\images\\headlessScreenshot.png";
		File destination =new File(dest);
		FileUtils.copyFile(source, destination);
		
		System.out.println("Screenshot captured..");
		
		driver.quit();
	}

}
