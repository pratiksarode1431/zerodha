package DDF_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_Framework {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\M\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://kite.zerodha.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//give global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//enter userID
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
		//Enter Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
		//click on login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//enter PIN
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
		//click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//Verify UserID
		String expID = "DPG458";
		String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		if(expID.equals(actID)) {
			System.out.println("TC is Pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
		
	}

}
