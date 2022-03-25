package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;

	
	@FindBy(xpath="//a[text()='Casual Dresses']")
	private WebElement casualDress;


	public Women(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasualDress() {
		return casualDress;
	}


}
