package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTC {
	@Test
	public void TC1() {
		Reporter.log("Running TC1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("Running TC2",true);
	}
	@Test
	public void TC3() {
		Reporter.log("Running TC3",true);
		Assert.fail();
	}

}
