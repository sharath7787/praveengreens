package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static void browser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void typeText(WebElement ref, String text) {
		ref.sendKeys(text);
	}

	public void button(WebElement ref1) {
		ref1.click();
	}

	public void dropdowntext(WebElement ref, String text) {
		Select s = new Select(ref);
		s.selectByVisibleText(text);
	}

	public static void dropdownvalue(WebElement ref, String text) {
		Select h = new Select(ref);
		h.selectByValue(text);
	}

	public static String output(WebElement ref, String text) {
return ref.getAttribute(text);		
	}

}
