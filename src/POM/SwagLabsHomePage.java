package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {
	//step1:-Declaration
	@FindBy(xpath="//span[@class='title']")private WebElement header;
	
	//step2:-Initialization
	public SwagLabsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//step3:-Utilization
	public void verifyHeader() {
		String expT="PRODUCTS";
		String actT=header.getText();
		if(expT.equals(actT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
