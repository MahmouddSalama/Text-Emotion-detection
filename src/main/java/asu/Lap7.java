package asu;

import java.sql.SQLOutput;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lap7 {
	
	
	@DataProvider(name = "data")
	public static Object [] []name() {
		
		return new Object[][] {
			{5},
			{6},
			{7},
			{8},
			{9},
			{10},
		};
		
	}
	
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void setUP( String browser ) {
		if (browser.equals("ED"))
			driver=new EdgeDriver();
		else if(browser.equals("Cr"))
			driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	}
	
	@Test(groups = {"group1"})
	@Parameters("x")
	public void testCase1(int x) {
		
		System.out.print(x);
	}
	
	@Test
	public void testCase2() {
		
		System.out.print(2);
	}
	
	@Test(groups = {"group1"})
	@Parameters("x")
	public void testCase3(int x) {
		
		System.out.print(x);
	}
	
	@Test(dataProvider = "data",priority = 5)
	public void dataProviderMethod(int x) {
		System.out.print(x);
	}

	@AfterClass
	public void quit() {
		driver.quit();
	}

}
