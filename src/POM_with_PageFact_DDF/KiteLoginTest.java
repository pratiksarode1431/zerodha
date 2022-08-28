package POM_with_PageFact_DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\M\\Desktop\\Automation Testing\\Zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Pratik");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		//maximize
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//POM class1
		Kite_Login1_Page login1=new Kite_Login1_Page(driver);
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		login1.enterUN(username);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterPWD(password);
		login1.clickLoginBtn();
		
		//POM class2
		Kite_Login2_Page login2=new Kite_Login2_Page(driver);
		String pinvalue=sh.getRow(0).getCell(2).getStringCellValue();
		login2.enterPIN(pinvalue);
		login2.clickCtnBtn();
		
		//POM class3
		Kite_HomePage home=new Kite_HomePage(driver);
		String expID = sh.getRow(0).getCell(0).getStringCellValue();
		home.verifyuserID(expID);
		driver.close();
		
		
	}

}
