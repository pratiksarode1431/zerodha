package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//POM class1
		OrangeHRM_LoginPage login=new OrangeHRM_LoginPage(driver);
		login.enterUN();
		login.enterPWD();
		login.clickLoginBtn();
		
		//POM class2
		OrangeHRM_HomePage hm=new OrangeHRM_HomePage(driver);
		hm.verifyuserID();
		driver.close();
	}

}
