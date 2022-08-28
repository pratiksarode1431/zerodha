package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 {//POM class-2 (BLC)
	//Step-1:- Declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ctnBtn;
	
	//Step-2:- Initialization
	public KiteLoginPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//Step-3:- Utilization
	public void enterPIN() {
		PIN.sendKeys("171992");
	}
	public void clickctnBtn() {
		ctnBtn.click();
	}

}
