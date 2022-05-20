package org.detail;

import org.base.Baseclass;
import org.base.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Information {
	Baseclass b = new Baseclass();

	@Given("launch of chrome browse")
	public void launch_of_chrome_browse() {
		b.browser("https://adactinhotelapp.com/index.php");
		
	}

	@When("user enter {string} and {string} and login")
	public void user_enter_and_and_login(String string, String string2) {
		Main m = new Main();
		b.typeText(m.getUsername(), string);
		b.typeText(m.getPassword(), string2);
		b.button(m.getButton());
	}

	@When("user should enter the details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_the_details(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9, String string10,
			String string11, String string12, String string13, String string14, String string15, String string16)
			throws Exception {
		Main m = new Main();
		b.dropdowntext(m.getLocation(), string);
		b.dropdowntext(m.getHotel(), string2);
		b.dropdowntext(m.getRoomtype(), string3);
		b.dropdowntext(m.getNoofroom(), string4);
		b.typeText(m.getCheckin(), string5);
		b.typeText(m.getCheckout(), string6);
		b.dropdowntext(m.getAdults(), string7);
		b.dropdowntext(m.getChildrens(), string8);
		b.button(m.getButtonsearch());
		b.button(m.getRadiobutton());
		b.button(m.getSearchtwo());
		b.typeText(m.getFirstname(), string9);
		b.typeText(m.getLastname(), string10);
		b.typeText(m.getBilling(), string11);
		b.typeText(m.getCardno(), string12);
		b.dropdowntext(m.getCardtype(), string13);
		b.dropdowntext(m.getExpmonth(), string14);
		b.dropdowntext(m.getExpyear(), string15);
		b.typeText(m.getCvvno(), string16);
		b.button(m.getBookbutton());
		Thread.sleep(3000);
		

	}

@When("user logining in")
public void user_logining_in() {
    Main m = new Main();
    WebElement orderId = m.getOrderId();
    String attribute = orderId.getAttribute("value");
    System.out.println(attribute);
}

@Then("user verifies page is visible or not")
public void user_verifies_page_is_visible_or_not() {
 
	
	
}

	
}
