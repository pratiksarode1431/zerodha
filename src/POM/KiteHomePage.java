package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {//POM class-3 (BLC)
	//Step-1:- Declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
	
	//Step-2:- Initialization
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//step-3:- Utilization
	public void verifyuserID() {
		String exptID="DPG458";
		String actID=userID.getText();
		if(actID.equals(exptID)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}
	

}
