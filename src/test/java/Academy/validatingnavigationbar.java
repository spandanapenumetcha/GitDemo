package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObject.landingpage;
import resources.base;

public class validatingnavigationbar extends base{
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
public WebDriver driver;
	

@Test()

public void homepagenavigation() throws IOException
{
	driver = initializedriver();
	landingpage lp = new landingpage(driver);
	
	Assert.assertTrue(lp.contactelement().isDisplayed());
	log.info("contact element validated");
	
}
@AfterTest

public void closewindow()
{
	driver.close();
	driver=null;
}

	
}
