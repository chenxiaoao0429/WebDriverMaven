package testcase;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	@BeforeSuite  //executing once before entire suite
	//run only once
	public void SetUp() {
		System.out.println("Initializing Everything!!!");
	}
	@AfterSuite
	//run only once
	public void tearDown() {
		System.out.println("Quitting Everything!!!");
	}
	@BeforeTest
	//run only once before the class
	public void createDBconn() {
		System.out.println("creating DB");
	}
	@AfterTest
	//run only once
	public void closeDBconn() {
		System.out.println("closing DB");
	}
	@BeforeMethod
	//run before each testcase
	public void launchBrowser() {
		System.out.println("Lauching Browser");
	}
	@AfterMethod
	//run after each testcase
	public void CloseBrowser() {
		System.out.println("closing Browser");
	}
	@Test (priority=2,dependsOnMethods="doUserReg") //if douserreg failed, this testcase will be skipped
	public void doLogin() {
		System.out.println("executing login test");
	}
	@Test (priority=1)
	public void doUserReg() {
		System.out.println("executing User regi test");
		Assert.fail("assert fail here");
	}
	@Test (priority=3,dependsOnMethods="doUserReg",alwaysRun=true)//soft dependency. always run no matter depend methos pass or fail
	public void testcase3() {
		System.out.println("executing testcase 3");
				
	}
	@Test 
	public void isSkip() {
		throw new SkipException ("force skip");
	}
}
