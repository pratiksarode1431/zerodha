package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {
	//step1:-Declaration
	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']")private WebElement LoginBtn;
	
	//step2:-Initialization
	public SwagLabsLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//step3:-Utilization
	public void enterUN() {
		UN.sendKeys("standard_user");
		
	}
	public void enterPWD() {
		PWD.sendKeys("secret_sauce");
	}
	public void clickLoginBtn() {
		LoginBtn.click();
		
	}

}
