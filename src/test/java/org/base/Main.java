package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main extends Baseclass {

	public Main() {
		PageFactory.initElements(driver, this);

	}

	@FindAll({ @FindBy(name = "username"), @FindBy(id = "username"),
			@FindBy(xpath = "//input[@class='login_input'])[1]") })
	private WebElement username;
	@FindAll({ @FindBy(name = "password"), @FindBy(id = "password"),
			@FindBy(xpath = "//input[@class='login_input'])[2]") })
	private WebElement password;
	@FindAll({ @FindBy(name = "login"), @FindBy(id = "login"), @FindBy(xpath = "//input[@class='login_button'])") })
	private WebElement button;

	@FindAll({ @FindBy(name = "location"), @FindBy(id = "location"),
			@FindBy(xpath = "//select[@class='search_combobox'])[1]") })
	private WebElement Location;

	@FindAll({ @FindBy(name = "hotels"), @FindBy(id = "hotels"),
			@FindBy(xpath = "//select[@class='search_combobox'])[2]") })
	private WebElement hotel;
	@FindAll({ @FindBy(name = "room_type"), @FindBy(id = "room_type"),
			@FindBy(xpath = "//select[@class='search_combobox'])[3]") })
	private WebElement roomtype;
	@FindAll({ @FindBy(name = "room_nos"), @FindBy(id = "room_nos"),
			@FindBy(xpath = "//select[@class='search_combobox'])[4]") })
	private WebElement Noofroom;
	@FindAll({ @FindBy(name = "datepick_in"), @FindBy(id = "datepick_in"),
			@FindBy(xpath = "//input[@class='date_pick'])[1]") })
	private WebElement Checkin;
	@FindAll({ @FindBy(name = "datepick_out"), @FindBy(id = "datepick_out"),
			@FindBy(xpath = "//input[@class='date_pick'])[2]") })
	private WebElement Checkout;
	@FindAll({ @FindBy(name = "adult_room"), @FindBy(id = "adult_room"),
			@FindBy(xpath = "//select[@class='search_combobox'])[5]") })
	private WebElement Adults;
	@FindAll({ @FindBy(name = "child_room"), @FindBy(id = "child_room"),
			@FindBy(xpath = "//select[@class='search_combobox'])[6]") })
	private WebElement Childrens;
	@FindAll({ @FindBy(name = "Submit"), @FindBy(id = "Submit"), @FindBy(xpath = "//input[@class='reg_button'])") })
	private WebElement buttonsearch;
	@FindAll({ @FindBy(name = "first_name"), @FindBy(id = "first_name"),
			@FindBy(xpath = "//input[@class='reg_input'])[1]") })
	private WebElement Firstname;
	@FindAll({ @FindBy(name = "last_name"), @FindBy(id = "last_name"),
			@FindBy(xpath = "//input[@class='reg_input'])[2]") })
	private WebElement Lastname;
	@FindAll({ @FindBy(name = "address"), @FindBy(id = "address"), @FindBy(xpath = "//textarea[@class='txtarea']") })
	private WebElement Billing;
	@FindAll({ @FindBy(name = "cc_num"), @FindBy(id = "cc_num"), @FindBy(xpath = "//input[@class='reg_input'])[3]") })
	private WebElement Cardno;
	@FindAll({ @FindBy(name = "cc_type"), @FindBy(id = "cc_type"),
			@FindBy(xpath = "//select[@class='select_combobox']") })
	private WebElement Cardtype;
	@FindAll({ @FindBy(name = "cc_exp_month"), @FindBy(id = "cc_exp_month"),
			@FindBy(xpath = "//select[@class='select_combobox2'][1]") })
	private WebElement Expmonth;
	@FindAll({ @FindBy(name = "cc_exp_year"), @FindBy(id = "cc_exp_year"),
			@FindBy(xpath = "//select[@class='select_combobox2'][2]") })
	private WebElement Expyear;
	@FindAll({ @FindBy(name = "cc_cvv"), @FindBy(id = "cc_cvv"), @FindBy(xpath = "//input[@class='reg_input'])[4]") })
	private WebElement Cvvno;
	@FindAll({ @FindBy(name = "radiobutton_0"), @FindBy(id = "radiobutton_0"),
			@FindBy(xpath = "//input[@type='value'])") })
	private WebElement radiobutton;
	@FindAll({ @FindBy(name = "continue"), @FindBy(id = "continue"), @FindBy(xpath = "//input[@class='reg_button'])") })
	private WebElement searchtwo;
	@FindAll({ @FindBy(name = "book_now"), @FindBy(id = "book_now"), @FindBy(xpath = "//input[@value='Book Now'])") })
	private WebElement bookbutton;
	@FindAll({ @FindBy(name = "order_no"), @FindBy(id = "order_no") })
	private WebElement orderId;
	
	
	
	public WebElement getOrderId() {
		return orderId;
	}
	

	public WebElement getBookbutton() {
		return bookbutton;
	}

	public WebElement getSearchtwo() {
		return searchtwo;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofroom() {
		return Noofroom;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChildrens() {
		return Childrens;
	}

	public WebElement getButtonsearch() {
		return buttonsearch;

	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getBilling() {
		return Billing;
	}

	public WebElement getCardno() {
		return Cardno;
	}

	public WebElement getCardtype() {
		return Cardtype;
	}

	public WebElement getExpmonth() {
		return Expmonth;
	}

	public WebElement getExpyear() {
		return Expyear;
	}

	public WebElement getCvvno() {
		return Cvvno;
	}
	
	
}


