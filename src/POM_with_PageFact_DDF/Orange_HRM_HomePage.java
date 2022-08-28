package POM_with_PageFact_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_HomePage {
	//Declaration
	@FindBy(xpath="//a[@id='welcome']")private WebElement userID;
	
	//Initialization
	public Orange_HRM_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void verifyuserID(String expID) {
		String actID=userID.getText();
		
		if(actID.equals(expID)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
