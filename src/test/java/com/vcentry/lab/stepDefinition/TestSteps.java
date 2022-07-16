package com.vcentry.lab.stepDefinition;

import com.vcentry.lab.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps extends BaseClass {
	@Given("Open {string} browser")
	public void open_browser(String string) {
		openBrowser(string);
		initObject();

	}

	@Given("Launch the given url")
	public void launch_the_given_url() {
		getDriver().get("https://www.saucedemo.com/");

	}

	@Given("Enter username as {string}")
	public void enter_username_as(String string) {
		login.enterUsername(string);
	}

	@Given("Enter password as {string}")
	public void enter_password_as(String string) {
		login.enterPassword(string);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		login.clickLogin();
	}

	@Then("User should navigate to Homepage")
	public void user_should_navigate_to_homepage() {
		home.verifyLogin();
	}

	@Then("verify login error message")
	public void verify_login_error_message() {
		login.verifyErroMsg();
	}

	@Given("Add Backpack to cart")
	public void add_backpack_to_cart() {
		home.addBackpacktocart();
	}

	@Then("verify product in the cart")
	public void verify_product_in_the_cart() {
		cart.verifyProduct();
	}

	@Then("Click Checkout and fill the details")
	public void click_checkout_and_fill_the_details() throws InterruptedException {
		cart.clickCheckOut();
		cart.enterFirtnameCheckoutDetails("Test");
		cart.enterLastnameCheckoutDetails( "abc", "56789");
	}

	@When("click on continue and Finish")
	public void click_on_continue_and_finish() {
		cart.clickContinueAndFinish();
	}

	@Then("verify order is placed")
	public void verify_order_is_placed() {
		cart.verifyOrderPlaced();
	}
}
