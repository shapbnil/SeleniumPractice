package TestNgDemo.TestNgDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import info.common.Common;

public class Anotations {

	Common common = new Common();
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("After suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AFter class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
		 driver = common.launchBrowser();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AFter method");
		common.closeBrowser(driver);
	}

	
}
