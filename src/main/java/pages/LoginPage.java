package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver d) {
		this.driver=d;
		AjaxElementLocatorFactory f= new AjaxElementLocatorFactory(driver,100);
		PageFactory.initElements(f, this);
	}
	
//	By id=By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
//	By password=By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input");
//	By button=By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement id;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement password;
	
	@FindBy(xpath = "html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement button;
	
	
	public void setId(String s) {
		//driver.findElement(id).sendKeys(s);
		id.sendKeys(s);
	}
	
	public void setpass(String s) {
		//driver.findElement(password).sendKeys(s);
		password.sendKeys(s);
	}
	
	
	public void click() {
		//driver.findElement(button).submit();
		button.submit();
	}
	
}
