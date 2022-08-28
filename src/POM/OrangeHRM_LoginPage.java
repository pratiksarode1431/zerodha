package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage {
	//step1:-Declaration
	@FindBy(xpath="//input[@id='txtUsername']")private WebElement UN;
	@FindBy(xpath="//input[@id='txtPassword']")private WebElement PWD;
	@FindBy(xpath="//input[@id='btnLogin']")private WebElement LoginBtn;
	
	//step2:- Initialization
	public OrangeHRM_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//step3:-Utilization
	public void enterUN() {
		UN.sendKeys("Admin");
	}
	public void enterPWD() {
		PWD.sendKeys("admin123");
	}
	public void clickLoginBtn() {
		LoginBtn.click();
	}

}
