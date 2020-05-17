package TestNgDemo.TestNgDemo;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.testng.Assert;
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

import info.common.ExcelOperations;



public class TestNgTest extends Anotations{

	//@Test(dataProvider = "dataProviderTest")
	public void test1(String usernam,String password, String dob) throws Exception {
		System.out.println("Test1"); 
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys(usernam);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("(//*[@value='Sign In'])[3]")).click();
		
		Thread.sleep(5000);
	}

	@Test
	public void test2() {
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("venkat");
		driver.findElement(By.name("password")).sendKeys("Venkat");
	}
	
	@Test
	public void test3() {
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("venkat");
		driver.findElement(By.name("password")).sendKeys("Venkat");
	}
	
	@Test
	public void test5() {
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("venkat");
		driver.findElement(By.name("password")).sendKeys("Venkat");
	}
	
	@Test
	public void test4() {
		driver.get("https://www.greyhound.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("username")).sendKeys("venkat");
		driver.findElement(By.name("password")).sendKeys("Venkat");
	}
	
	@DataProvider(name = "dataProviderTest")
	public Object[][] dataProviderDemo()  throws Exception{
		ExcelOperations ex = new ExcelOperations();
		XSSFSheet sheet =ex.readDataFromExcel("C:\\Users\\shapbnil\\Documents\\TestData.xlsx", "UserDetails");
		Object[][] data=ex.getExcelData(sheet);
		return data;
				
		/*Object[][] data= {{"Username1","Password1"},{"Username3","Password2"},{"Username3","Password3"}};
		
		return data;*/
	}

}
