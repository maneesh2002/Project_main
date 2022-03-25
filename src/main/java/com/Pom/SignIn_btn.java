package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_btn {
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="passwd")
	private WebElement pass;

	@FindBy(id="SubmitLogin")
	private WebElement submit_btn;

	public SignIn_btn(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit_btn() {
		return submit_btn;
	}
}

