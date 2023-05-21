package asu;

import org.openqa.selenium.Alert;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Lap5 {
	
	public static void alert() {
		WebDriver drive=new EdgeDriver();
		drive.manage().window().maximize();
		drive.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement textBox=drive.findElement(By.xpath("//input[@name='cusid']"));
		textBox.sendKeys("10");
		
		WebElement button =drive.findElement(By.xpath("//input[@name='submit']"));
		button.click();
		
		drive.switchTo().alert().accept();
		
		Alert a2= drive.switchTo().alert();
		System.out.println(a2.getText());
		a2.accept();
	}
	
	public static void windowHandeling() {
		WebDriver drive=new EdgeDriver();
		drive.manage().window().maximize();
		drive.get("https://demo.guru99.com/popup.php");
		String homeHandel=drive.getWindowHandle();
		
		WebElement button=drive.findElement(By.linkText("Click Here"));
		button.click();
		
		Set<String> S=drive.getWindowHandles();
		
		for(String s : S) {
			if(s.equalsIgnoreCase(homeHandel)) {
				
				 drive.switchTo().window(s);
			}
		}
	}
	
}
