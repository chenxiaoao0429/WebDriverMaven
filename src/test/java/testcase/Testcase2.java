package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 {
	@Test
	public void validateTitles() {
		System.out.println("Start");
		String expected_title ="yahoo.com";
		String actual_title ="gmail.com";
		//Assert.assertEquals(actual_title, expected_title);//exception failure, test execution break
		//Assert.fail("failing message");
		System.out.println("End");
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(actual_title,expected_title);
		softAssert.assertEquals(true,false,"element not found error");
		//soft assertion, failure can continue execution
		softAssert.assertAll();
		System.out.println("End");
	}

}
