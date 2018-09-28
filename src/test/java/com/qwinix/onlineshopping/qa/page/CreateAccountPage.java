package com.qwinix.onlineshopping.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.onlineshopping.qa.BaseDriver;


public class CreateAccountPage {
	
	public CreateAccountPage() {
		PageFactory.initElements(BaseDriver.driver, this);
	}
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	public WebElement createaccount;
	
	@FindBy(xpath="//input[@id='email_create']")
	public WebElement summerdress5;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	public WebElement fname;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	public WebElement lname;
	
	@FindBy(xpath="//input[@id='passwd']")
	public WebElement pwd;
	
	@FindBy(xpath="//input[@id='address1']")
	public WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	public WebElement city;
	
	@FindBy(xpath="//input[@id='postcode']")
	public WebElement zipcode;
	
	@FindBy(xpath="//textarea[@id='other']")
	public WebElement txt;
	
	@FindBy(xpath="//select[@id='id_state']")
	public WebElement state;
	
	@FindBy(xpath="//button[@id='submitAccount']")
	public WebElement register;
}
