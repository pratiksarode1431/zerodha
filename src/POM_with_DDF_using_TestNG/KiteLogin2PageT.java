package POM_with_DDF_using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2PageT {
	//step1:-Declaration
		@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement CtnBtn;
		
		//step2:-Initialization
		public KiteLogin2PageT(WebDriver driver) {
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
