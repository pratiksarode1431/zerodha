package POM_with_DDF_using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePageT {
	//step1:-Declaration
		@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
		
		//step2:-Initialization
		public Kite_HomePageT(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//step3:-Utilization
		public String verifyuserID() {
			
			String actID=userID.getText();
			return actID;
		}

}
