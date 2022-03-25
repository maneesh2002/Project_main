package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement pay;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm;
	
	@FindBy(xpath="//a[text()='expert customer support team. ']")
	private WebElement text;

	public Payment(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	public WebElement gettext() {
		return text;
	}	

}
