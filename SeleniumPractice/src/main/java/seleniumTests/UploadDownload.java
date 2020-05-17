package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadDownload {
	@Test
	public void upload() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();
			
			// enter the file path onto the file-selection input field
			driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\shapbnil\\Desktop\\test case.txt");
			
			 // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.id("submitbutton")).click();
	        
	        //driver.get("http://demo.guru99.com/test/yahoo.html");
	        
	        
	} 	
	        	
}
