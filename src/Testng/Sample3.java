package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void TC7() {
		Reporter.log("Running TC7",true);
	}
	@Test
	public void TC8() {
		Reporter.log("Running Tc8",true);
	}
	@Test
	public void TC9() {
		Reporter.log("Running TC9",true);
	}

}
