package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class landingpage {

	public WebDriver driver;
	
	public landingpage(WebDriver driver)
	{
		this.driver = driver; 
	}
	 By contact = By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[8]/a");
	
		public WebElement contactelement()
		{
			return driver.findElement(contact);
		}
		
		By element = By.xpath("//div[@class='text-center']/h2");
		
		public WebElement mainpageelement()
		{
			return driver.findElement(element);
		}	
	
	By login = By.linkText("Login");
	
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
	
	public static void main(String[] args) {
 

	}

}
