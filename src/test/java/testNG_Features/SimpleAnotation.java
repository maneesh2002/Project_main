package testNG_Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnotation {
	
	//Run @Aftersuite in xml
	
	@BeforeSuite
	private void browserLaunch() {	  
		System.out.println("browserLaunch");
	}

	@BeforeTest
	private void url() {
		System.out.println("Url");
	}
	
	@BeforeClass
	private void home() {
		System.out.println("Home page");
	}
	
	@BeforeMethod
	public void sighIn() {
		System.out.println("Signin");
	}
	
	@Test
	public void menDress() {
		System.out.println("Men Dress Purchase");
	}
	
	@Test
	public void womenDress() {
		System.out.println("Women Dress Purchase");
	}
	
	@AfterMethod
	private void signOut() {
		System.out.println("SignOut");
	}
	
	@AfterClass
	private void takeScreenshot() {
		System.out.println("Take screenshot");
	}
	
	@AfterTest
	private void deleteCookie() {
		System.out.println("Delete Cookie");

	}
	
	@AfterSuite
	private void closeBrowser() {
		System.out.println("close browser");
	}
	
	
	
	
	
	
	
	
}
