package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\M\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		//maximize
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//POM class1
		SwagLabsLoginPage sw=new SwagLabsLoginPage(driver);
		sw.enterUN();
		sw.enterPWD();
		sw.clickLoginBtn();
		
		//POM class2
		SwagLabsHomePage hm=new SwagLabsHomePage(driver);
		hm.verifyHeader();
		driver.close();
	}

}
