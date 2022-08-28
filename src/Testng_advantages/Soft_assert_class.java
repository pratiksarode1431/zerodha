package Testng_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert_class {
	@Test
	public void TC1() {
		Reporter.log("Running TC 1",true);
		String expR="Hii";
		String actR="Byee";
		 
		//Object of Soft class
		SoftAssert s=new SoftAssert();
		s.assertEquals(expR, actR);//verification-1
		
		s.assertAll();//mandatory
	}
	@Test
	public void TC2() {
		Reporter.log("Hii hello",true);
	}

}
