package DDF_Framework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_DDF {
	public static void main(String[] args) throws Throwable {
		//create object of FIS class
		FileInputStream fis=new FileInputStream("C:\\Users\\M\\Desktop\\Automation Testing\\Zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Pratik");
		
		//set properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://kite.zerodha.com/");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//maximize
		driver.manage().window().maximize();
		//Enter UN
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		//Enter PWD
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		//click on login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//Enter PIN
		String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		//click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		//Verify UserID
		String expID = "DPG458";
		String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		if(expID.equals(actID)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		
	}

}
