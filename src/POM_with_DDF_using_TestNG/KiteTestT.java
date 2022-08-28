package POM_with_DDF_using_TestNG;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestT {
	//Declare all useful member as Global
	Sheet sh;
	WebDriver driver;
	KiteLogin1PageT login1;
	KiteLogin2PageT login2;
	Kite_HomePageT home;
	
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\M\\Desktop\\Automation Testing\\Zerodha.xlsx");
		sh = WorkbookFactory.create(fis).getSheet("Pratik");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		//maximize
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//All object of POM classes
		login1=new KiteLogin1PageT(driver);
		login2=new KiteLogin2PageT(driver);
		home=new Kite_HomePageT(driver);
	}
	@BeforeMethod
	public void LoginToApp() {
		//Enter UN
		String username = sh.getRow(0).getCell(0).getStringCellValue();//DPG458
		login1.enterUN(username);
		//Enter PWD
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterPWD(password);
		//click on login button
		login1.clickLoginBtn();
		
		//Enter PIN
		String pinvalue=sh.getRow(0).getCell(2).getStringCellValue();
		login2.enterPIN(pinvalue);
		//click on Continue button
		login2.clickCtnBtn();
		
	}
	@Test
	public void verifyuserID() {
		Reporter.log("Running verify userID");
		String actID=home.verifyuserID();
		String expID = sh.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(expID, actID);
		
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("Logout the application",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close the App",true);
		driver.close();
	}
}
