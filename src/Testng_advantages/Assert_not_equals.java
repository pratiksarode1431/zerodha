package Testng_advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_not_equals {
	@Test
	public void TC2() {
		Reporter.log("Running TC",true);
		String expR="Anky";
		String actR="Donkey";
		Assert.assertNotEquals(expR, actR);
}
	

}
