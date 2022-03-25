package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed {
	public static WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Printed Dress'])[2]")
	private WebElement dress;
	
	@FindBy(id="quantity_wanted")
	private WebElement quantity;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(name="Submit")
	private WebElement addTOCart;

	public Printed(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDress() {
		return dress;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getAddTOCart() {
		return addTOCart;
	}

}