package info.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Common {

	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		return driver;
	}
	
	public void navigateUrl(WebDriver driver,String url) {
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	public void clickObj(WebDriver driver, By by,String message) {
		try {
			driver.findElement(by).click();
			System.out.println("Successfully click "+message);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failure to click "+message);
		}
		
	}
	public void enterText(WebDriver driver, By by,String text,String message) {
		
		try {
			driver.findElement(by).sendKeys(text);
			System.out.println("Successfully enter text "+message);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failure to enter text "+message);
		}
		 
	}

public void select(WebDriver driver, By by,String text, String message) {
	try {
	Select s=new Select(driver.findElement(by));
		s.selectByVisibleText(text);  //recomended
		System.out.println("Successfully enter text "+message);
	}catch (Exception e) {
		System.out.println("Failure to enter text "+message);
	}
}


}

