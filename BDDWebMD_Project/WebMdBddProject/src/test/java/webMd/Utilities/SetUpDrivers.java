package webMd.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpDrivers {

	public static WebDriver chromeDriver;
	
	

	public static void setUpChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tasnim Hyder\\Desktop\\BDDWebMD_Project\\WebMdBddProject\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
	}
	
	public static WebDriver getChromeDriver() {
		return chromeDriver;
	}
	
	public static void closeChromeDriver() {
		chromeDriver.quit();
	}
	
	
}
	
	
