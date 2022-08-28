package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags {
	@Test(invocationCount = 5)
	public void TC() {
		Reporter.log("Running TC",true);
	}

}
