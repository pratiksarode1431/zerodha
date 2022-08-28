package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class True {
	@Test
	public void TC3() {
		Reporter.log("Running TC1",true);
		boolean actR=true;
		Assert.assertTrue(actR);
	}

}
