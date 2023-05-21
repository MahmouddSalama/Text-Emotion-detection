package asu;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lap4 {
	
	public static void dropdowen() {
		
		WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
        Select select=new Select(dropdown);
        
        select.selectByIndex(5);
        
        List<WebElement> options= select.getOptions();
        
        for(int i =0;i<options.size();i++) {
        	System.out.print(options.get(i).getText());
        	System.out.print("\n");
        }
        
        
	}

}
