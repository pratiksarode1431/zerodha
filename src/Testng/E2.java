package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E2 {
	@Test
	public void TC() {
		Reporter.log("Hello",true);
	}

}
