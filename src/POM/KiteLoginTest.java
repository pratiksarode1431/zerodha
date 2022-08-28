package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {//ULC (Test class)
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		//maximize
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//1st POM class
		KiteLoginPage1 login1=new KiteLoginPage1(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.clickLOGINBTN();
		
		//2nd POM class
		KiteLoginPage2 login2=new KiteLoginPage2(driver);
		login2.enterPIN();
		login2.clickctnBtn();
		
		//3rd POM class
		KiteHomePage home=new KiteHomePage(driver);
		home.verifyuserID();
		driver.close();
	}

}
