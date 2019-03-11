package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	
public WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver; 
	}
	
	By username = By.id("user_email");
	
	By passwrd = By.id("user_password");
	
	By login = By.xpath("//input[@type='submit']");
	
	public WebElement emailadd()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(passwrd);
	}
	
	public WebElement login() 
	{
		return driver.findElement(login);
	}

	
}
