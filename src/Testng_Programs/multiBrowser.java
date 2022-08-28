package Testng_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiBrowser {
	@Parameters("browsername")//Annotation
	@Test
	public void TC(String browsername) {//parameterized method
		WebDriver driver=null;//Runtime Polymorphism
		if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();

	}
		else if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\M\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.get("https://kite.zerodha.com/");
		
				
				
			}
			
		}


