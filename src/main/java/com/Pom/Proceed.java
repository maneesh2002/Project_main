package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
		private WebElement checkout;
	

	public Proceed(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout() {
		return checkout;
	}
	

}
