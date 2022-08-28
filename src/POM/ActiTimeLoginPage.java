package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {//POM class1 (BLC)
	//step:1-Declaration
	@FindBy(xpath="//input[@id='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath="//div[text()='Login ']")private WebElement LoginBtn;
	
	//step:1-Initialization
	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//step:1-Utilization
	public void enterUsername() {
		UN.sendKeys("admin");
	}
	public void enterPassword() {
		PWD.sendKeys("manager");
	}
	public void clickLogin() {
		LoginBtn.click();
	}

}
