package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open the Browser",true);
	}
	@BeforeMethod
	public void loginApp() {
		Reporter.log("login to App",true);
	}
	@Test
	public void verifyID() {
		Reporter.log("verify userID",true);
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout from App",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close the browser",true);
	}

}
