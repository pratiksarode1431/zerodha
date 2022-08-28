package POM_with_PageFact_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage {
	//step1:-Declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
	
	//step2:-Initialization
	public Kite_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//step3:-Utilization
	public void verifyuserID(String expID) {
		
		String actID=userID.getText();
		if(actID.equals(expID)) {
			System.out.println("TC is Pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
