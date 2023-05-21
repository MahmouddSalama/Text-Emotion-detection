package asu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
