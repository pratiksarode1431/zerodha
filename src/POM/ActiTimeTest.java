package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		//maximize
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//POM class1
		ActiTimeLoginPage act=new ActiTimeLoginPage(driver);
		act.enterUsername();
		act.enterPassword();
		act.clickLogin();
		
		//POM class2
		ActiTimeHomePage home=new ActiTimeHomePage(driver);
		home.verifyuserID();
		driver.close();
	}

}
