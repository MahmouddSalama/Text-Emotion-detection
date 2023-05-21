package asu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Lap1 {
	
	 public static void lap1( )
	    {
	        System.out.println( "Hello World!" );
	        
	        WebDriver driver=new EdgeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://duckduckgo.com/");
	        
	        WebElement textBox=driver.findElement(By.id("searchbox_input"));
	        WebElement buton=driver.findElement(By.xpath("//*[@id=\"searchbox_homepage\"]/div/div/button"));
	        textBox.sendKeys("Mohamed salah");
	        buton.click();

	    }
	 
	 
	 public static void radio() {
		     WebDriver driver=new EdgeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://demo.guru99.com/test/radio.html");
	        
	        WebElement r=driver.findElement(By.id("vfb-7-1"));
	        
	        r.click();
	        if(r.isSelected()) {
	        	r.click();
	        }

	        
	 }

}
