package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public  class base {
	
	public WebDriver driver=null;

	public WebDriver initializedriver() throws IOException
	{
		Properties prop = new Properties();
	    FileInputStream fis = new FileInputStream("C:\\Users\\spand\\MainProject\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	   if(prop.getProperty("browser").equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver(); 
	   }
	   else if(prop.getProperty("browser").equals("firefox"))
	   {
			System.setProperty("webdriver.ie.driver","C:\\selenium\\MicrosoftWebDriver.exe");
		     driver = new InternetExplorerDriver(); 
	   }
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
	  return driver;
	
	}
	
	public void getscreenshot(String result) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\spand\\test\\errorscreenshot.png"));
		
	}	
}

