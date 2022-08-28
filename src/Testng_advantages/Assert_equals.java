package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
	@Test
	public void TC1() {
		Reporter.log("TC 1 is Running",true);
		
		String expR="Anky";
		String actR="Anky";
		Assert.assertEquals(expR, actR);
		
	}

}
