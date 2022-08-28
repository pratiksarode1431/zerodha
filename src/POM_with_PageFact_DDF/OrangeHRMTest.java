package POM_with_PageFact_DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTest {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\M\\Desktop\\Automation Testing\\Zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Pratik");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//maximize
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//POM class1
		Orange_HRM_LoginPage login=new Orange_HRM_LoginPage(driver);
		String username = sh.getRow(2).getCell(0).getStringCellValue();
		login.enterUN(username);
		String password=sh.getRow(2).getCell(1).getStringCellValue();
		login.enterPWD(password);
		login.clickLoginBtn();
		
		//POM class2
		Orange_HRM_HomePage home=new Orange_HRM_HomePage(driver);
		String expID=sh.getRow(2).getCell(2).getStringCellValue();
		home.verifyuserID(expID);
		driver.close();
	}

}
