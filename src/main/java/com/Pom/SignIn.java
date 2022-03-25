package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement signBtn;

	public SignIn(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSignBtn() {
		return signBtn;
	}

}
