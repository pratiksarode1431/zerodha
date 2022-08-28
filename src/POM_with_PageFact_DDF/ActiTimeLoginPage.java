package POM_with_PageFact_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
	//Declaration
	@FindBy(xpath="//input[@id='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath="//div[text()='Login ']")private WebElement LoginBtn;
	
	//Initialization
	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLoginBtn() {
		LoginBtn.click();
	}

}
