package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browserType) {
		if (browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();	
		}
		else if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new ChromeDriver();
		}
	}
		
	public static void launchUrl(String urltolaunch) {
		driver.get(urltolaunch);
	}
	
	public static void navigateTo(String urlToNavigate) {
		driver.navigate().to(urlToNavigate);
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void backward() {
		driver.navigate().back();
	}
	
	public static void close( ) {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println("Text of the element:  " + text);
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	public static void sendValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void frame(String type, WebElement element) {
		if (type.equalsIgnoreCase("passin")) {
			driver.switchTo().frame(element);
		}
		else if (type.equalsIgnoreCase("passout")) {
			driver.switchTo().defaultContent();
		}
	}
	
	public static void alert(String type) {
		Alert alert = driver.switchTo().alert();
		if (type.equalsIgnoreCase("Accept")) {
			alert.accept();
		}
		else if (type.equalsIgnoreCase("Dismiss")) {
			alert.dismiss();
		}
	}
	
	public static void implicitlywait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void actions(String type, WebElement element) {
		Actions act= new Actions(driver);
		if (type.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		}
		else if (type.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		}
		else if (type.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).build().perform();
		}
		else if (type.equalsIgnoreCase("rightclick")) {
			act.contextClick(element).build().perform();
		}		
	}

	public static void dropdown(WebElement element, String type, String value) {
		
		Select s = new Select(element);
		if(type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);			
		}
	}	

	public static void robot(String type) throws AWTException {
		
		Robot r = new Robot();
		if (type.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (type.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		else if (type.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}	
	}

	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MONISH\\eclipse-workspace\\MavenProject\\Screenshot\\"+ name +".png");
		FileUtils.copyFile(src, dest);
	}

	public static void windowsHandle(int index) {
		
		Set<String> windowHandles = driver.getWindowHandles();		
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(index));

	}

	public static void getParticularCellValue(String path, int rowIndex, int cellIndex) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		
		CellType type = cell.getCellType();
		
		if (type.equals(type.STRING)) {
			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
		}
		else if (type.equals(type.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			int i = (int) numericCellValue;
			String cellValue = Integer.toString(i);
			System.out.println(cellValue);
		}				
		wb.close();
		
		}













}
