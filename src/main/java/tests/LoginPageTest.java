package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v111.page.Page;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
	}
	@Test(groups = {"group1"})
	public void test1() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setId("10");
		loginPage.setpass("100001");
		loginPage.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void test2() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setId("10");
		loginPage.setpass("100001");
		loginPage.click();
		driver.switchTo().alert().accept();
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
