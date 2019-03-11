package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.landingpage;
import pageObject.loginpage;
import resources.base;

public class homepage extends base {

	
	public static Logger log = LogManager.getLogger(base.class.getName());	

@Test(dataProvider="getdata")

public void homepagenavigation(String username, String password, String text) throws IOException
{
	driver = initializedriver();
	landingpage lp = new landingpage(driver);
	lp.getlogin().click();
	loginpage lop = new loginpage(driver);
	lop.emailadd().sendKeys(username);
	lop.password().sendKeys(password);
	log.info("user1 and user2 validated");
	lop.login().click();

	
}
@AfterTest

public void closewindow()
{
	driver.close();
	driver=null;
}

@DataProvider

public Object[][] getdata()
{
	Object[][]data = new Object[2][3];
	
	// Row stands for how many different data types test should run
	//Column stands for how many values per each test
	
	//0th row
	data[0][0]= "spandanap@gmail.com";
	data[0][1]= "shcdh";
	data[0][2]= "1st user";
	
	//1st row
	data[1][0]="harsha@yahoo.co.in";
	data[1][1]="sdscvf";
	data[1][2]="2nd user";
			
return data;
}



}
