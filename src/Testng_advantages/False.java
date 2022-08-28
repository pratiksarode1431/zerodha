package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class False {
	@Test
	public void TC1() {
		Reporter.log("Running TC 1",true);
		boolean actR=false;
		Assert.assertFalse(actR);
	}

}
