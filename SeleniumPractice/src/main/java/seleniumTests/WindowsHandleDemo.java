package seleniumTests;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandleDemo {
	@Test
	public void Alert() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To open Naukri website with multiple windows
		driver.get("http://www.naukri.com/");
		// To maximize browser
		driver.manage().window().maximize();

		// It will return the parent window name as a String
		String mainWindow = driver.getWindowHandle();
		String childWindow;
		Thread.sleep(2000);
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set = driver.getWindowHandles();
		
		//using enhance for loop
		for (String window : set) {
			if (!mainWindow.equals(window)) {
				childWindow=window;
			}
		}
		// Using Iterator to iterate with in windows
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			 childWindow = itr.next();
			// Compare whether the main windows is not equal to child window. If not equal, we will close.
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		
		// This is to switch to the main window
		driver.switchTo().window(mainWindow);
		
		
		  Thread.sleep(3000); 
		 
	
	}
}