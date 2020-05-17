package TestNgDemo.TestNgDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import info.common.Common;



public class DataPro extends Common{
	WebDriver driver;
	
	
	@Test(dataProvider = "dataProviderTest")
	public void test1(String fnam,String lnam, String dob) throws Exception {
		driver=launchBrowser();
	navigateUrl(driver, "https://www.greyhound.com/");
	
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		clickObj(driver, By.xpath("//*[text()='Join road rewards for free']"), "Join Road");
		//driver.findElement(By.xpath("//*[text()='Join road rewards for free']")).click();
		
		driver.findElement(By.id("yourfirstName")).sendKeys(fnam);
		driver.findElement(By.id("yourlastName")).sendKeys(lnam);
		driver.findElement(By.id("dateOfBirth")).sendKeys(dob);
		
	
		
		Thread.sleep(5000);
		
		closeBrowser(driver);
	}


	
	@DataProvider(name = "dataProviderTest")
	public Object[][] dataProviderDemo() {
		
		Object[][] data= {{"Usr1","Password1", "dob1"},{"Usr2","Password2", "dob2"},{"Usr3","Password3", "dob3"}};
		
		
		return data;
	}

}
