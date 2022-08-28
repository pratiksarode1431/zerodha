package POM_with_PageFact_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login2_Page {
	//step1:-Declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement CtnBtn;
	
	//step2:-Initialization
	public Kite_Login2_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//step3:-Utilization
	public void enterPIN(String pinvalue) {
		PIN.sendKeys(pinvalue);
	}
	public void clickCtnBtn() {
		CtnBtn.click();
	}

}
