package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {//POM class-1 (BLC)
	
	//Step-1:- Declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
	
	//Step-2:- Initialization
	public KiteLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Step-3:- Utilization
	public void enterUN() {
		UN.sendKeys("DPG458");
	}
	public void enterPWD() {
		PWD.sendKeys("Amol@1234");
	}
	public void clickLOGINBTN() {
		LOGINBTN.click();
	}

}
