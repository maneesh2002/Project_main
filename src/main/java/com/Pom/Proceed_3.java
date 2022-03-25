package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_3 {
	public static WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement radio;
	
	@FindBy(name="processCarrier")
	private WebElement proceed2;

	public Proceed_3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getProceed2() {
		return proceed2;
	}
}
