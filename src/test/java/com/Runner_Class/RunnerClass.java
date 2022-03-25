package com.Runner_Class;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.PageObjectManager.PageObjectManager;
import com.Pom.BaseClass;

public class RunnerClass extends BaseClass{

	public static WebDriver driver = launchBrowser("chrome");

	public static void main(String[] args) throws InterruptedException, IOException {
		
		PageObjectManager pom = new PageObjectManager(driver);
			
		launchUrl("http://automationpractice.com/index.php");
		
		implicitlywait(10);
		actions("move", pom.getSi().getSignBtn());
		clickElement(pom.getSi().getSignBtn());
		sendValue(pom.getSb().getEmail(), "maneesh300@gmail.com");
		sendValue(pom.getSb().getPass(), "maneesh");
		clickElement(pom.getSb().getSubmit_btn());
		Thread.sleep(2000);
		actions("move", pom.getW().getWomen());
		clickElement(pom.getW().getCasualDress());
		Thread.sleep(2000);
		clickElement(pom.getP().getDress());
		clickElement(pom.getP().getAddTOCart());
		Thread.sleep(3000);
		clickElement(pom.getPro().getCheckout());
		clickElement(pom.getPro1().getProceed());
		clickElement(pom.getPro2().getProceed1());
		clickElement(pom.getPro3().getRadio());
		clickElement(pom.getPro3().getProceed2());
		clickElement(pom.getPay().getPay());
		clickElement(pom.getPay().getConfirm());
		actions("move", pom.getPay().gettext());
		screenshot("screen");
		
	}

}
