package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 8000)
	public void TC() {
		Reporter.log("Hii",true);
	}

}
