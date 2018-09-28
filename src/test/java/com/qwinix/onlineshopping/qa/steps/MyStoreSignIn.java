package com.qwinix.onlineshopping.qa.steps;

import org.openqa.selenium.WebDriver;

import com.qwinix.onlineshopping.qa.BaseDriver;
import com.qwinix.onlineshopping.qa.page.SignInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStoreSignIn {

	public WebDriver driver = BaseDriver.driver;
	public static CommonUtil objCOM = new CommonUtil();
	SignInPage signInPage = new SignInPage();

	@Given("^I am on OnlineTimeSheet Home Page$")
	public void i_am_on_OnlineTimeSheet_Home_Page() throws Throwable {
		objCOM.waitForPageLoaded();
		signInPage.openUrl();
	}

	@When("^I Enter Valid Credentials$")
	public void i_Enter_Valid_Credentials() throws Throwable {
		signInPage.signIn();
		signInPage.readExcelData();
	}

	@Then("^I should able to see the onlinetime sheet page$")
	public void i_should_able_to_see_the_onlinetime_sheet_page() throws Throwable {
//		signInPage.verifyAccount();
	}
}
