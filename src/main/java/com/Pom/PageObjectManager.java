package com.Pom;

import org.openqa.selenium.WebDriver;

import com.Pom.Payment;
import com.Pom.Printed;
import com.Pom.Proceed;
import com.Pom.Proceed_1;
import com.Pom.Proceed_2;
import com.Pom.Proceed_3;
import com.Pom.SignIn;
import com.Pom.SignIn_btn;
import com.Pom.Women;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private SignIn_btn sb;
	private SignIn si;
	private Women w;
	private Printed p;
	private Proceed pro;
	private Proceed_1 pro1;
	private Proceed_2 pro2; 
	private Proceed_3 pro3;
	private Payment pay;
	

	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		
	}
	public SignIn_btn getSb() {
		sb = new SignIn_btn(driver);
		return sb;
	}
	public SignIn getSi() {
		si = new SignIn(driver);
		return si;
	}
	public Women getW() {
		w = new Women(driver);
		return w;
	}
	public Printed getP() {
		p = new Printed(driver); 
		return p;
	}
	public Proceed getPro() {
		pro = new Proceed(driver);
		return pro;
	}
	public Proceed_1 getPro1() {
		pro1 = new Proceed_1(driver);
		return pro1;
	}
	public Proceed_2 getPro2() {
		pro2 = new Proceed_2(driver);
		return pro2;
	}
	public Proceed_3 getPro3() {
		pro3 = new Proceed_3(driver);
		return pro3;
	}
	public Payment getPay() {
		pay = new Payment(driver);
		return pay;
	}
}
