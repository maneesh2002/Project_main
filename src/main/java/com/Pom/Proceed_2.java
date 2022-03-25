package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_2 {
	public static  WebDriver driver;
	
	@FindBy(name="processAddress")
	private WebElement proceed1;

	public Proceed_2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed1() {
		return proceed1;
	}
	
}
