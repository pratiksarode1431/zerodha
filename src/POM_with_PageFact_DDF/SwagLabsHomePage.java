package POM_with_PageFact_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {
	//Declaration
	@FindBy(xpath="//span[@class='title']")private WebElement userID;
	
	//Initialization
	public SwagLabsHomePage(WebDriver driver) {
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
