package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_HomePage {
	//step1:-Declaration
	@FindBy(xpath="//a[@id='welcome']")private WebElement userID;
	
	//step2:Initialization
	public OrangeHRM_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//step3:-Utilization
	public void verifyuserID() {
		String expID="Welcome Leone";
		String actID=userID.getText();
		if(actID.equals(expID)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
