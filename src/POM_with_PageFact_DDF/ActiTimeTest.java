package POM_with_PageFact_DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\M\\Desktop\\Automation Testing\\Zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Pratik");
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\M\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		//maximize
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//POM class1
		ActiTimeLoginPage login1=new ActiTimeLoginPage(driver);
		String username = sh.getRow(1).getCell(0).getStringCellValue();
		login1.enterUN(username);
		String password=sh.getRow(1).getCell(1).getStringCellValue();
		login1.enterPWD(password);
		login1.clickLoginBtn();
		
		//POM class2
		ActiTimeHomepage home=new ActiTimeHomepage(driver);
		String expID=sh.getRow(1).getCell(2).getStringCellValue();
		home.verifyuserID(expID);
		driver.close();
		
	}

}
