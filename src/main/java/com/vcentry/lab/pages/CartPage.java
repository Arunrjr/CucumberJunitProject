package com.vcentry.lab.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vcentry.lab.base.BaseClass;

public class CartPage extends BaseClass {
	WebDriver driver; // global variable

	public CartPage(WebDriver driver) { // constructor
		this.driver = driver; // value assigned for global variable
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='inventory_item_name']") // this @-FindBy is
															// used only in
															// pageFactory for
															// locators insert
	private WebElement backpack;
	
	@FindBy(id = "checkout")
	private WebElement checkout;
	
	@FindBy(id="first-name")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(id="postal-code")
	private WebElement postalCode;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(id = "finish")
	private WebElement finishBtn;
	@FindBy(xpath = "//div[@id='checkout_complete_container']/h2")
	private WebElement orderPlaced;

	public void verifyProduct() {
		Assert.assertEquals("Sauce Labs Backpack", backpack.getText());
	}

	public void clickCheckOut() {
		clickElement(checkout);
	}

	public void enterFirtnameCheckoutDetails(String fName) throws InterruptedException {
	enterText(firstName, fName);
	
	}
	
	public void enterLastnameCheckoutDetails(String lName, String code) throws InterruptedException {
		
		Thread.sleep(5000);
		enterText(lastName,lName);
		enterText(postalCode,code);
		
		}

	public void clickContinueAndFinish() {
		clickElement(continueBtn);
		clickElement(finishBtn);
	}

	public void verifyOrderPlaced() {
		Assert.assertTrue(elementDisplayed(orderPlaced));
	}
}