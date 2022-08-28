package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage {//POM class2(BLC)
	//step1:-Declaration
	@FindBy(xpath="//a[@class='userProfileLink username ']")private WebElement userID;
	
	//step2:-Initialization
	public ActiTimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//step3:- Utilization
	public void verifyuserID() {
		String expID="John Doe";
		String actID=userID.getText();
		if(expID.equals(actID)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
