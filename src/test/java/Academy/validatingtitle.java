package Academy;

import java.io.IOException;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObject.landingpage;
import resources.base;

public class validatingtitle extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());
	
public WebDriver driver;
	
@Test()

public void homepagenavigation() throws IOException
{
	driver = initializedriver();
	landingpage lp = new landingpage(driver);
	
	Assert.assertEquals(lp.mainpageelement().getText(), "FEATURED COURSES");
	log.info("main page element validated");
	
}
@AfterTest

public void closewindow()
{
	driver.close();
	driver=null;
}
    


}
