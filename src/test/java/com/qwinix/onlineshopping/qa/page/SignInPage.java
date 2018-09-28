package com.qwinix.onlineshopping.qa.page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.onlineshopping.qa.BaseDriver;
import com.qwinix.onlineshopping.qa.steps.CommonUtil;
import com.qwinix.onlineshopping.qa.steps.ConfigReader;

public class SignInPage {

	CommonUtil objCOM = new CommonUtil();
	public static WebDriver driver = BaseDriver.driver;
	ConfigReader config = new ConfigReader();

	public SignInPage() {
		PageFactory.initElements(BaseDriver.driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signIn;

	@FindBy(xpath = "//h3[contains(.,'Already registered?')]")
	public WebElement alreadyReg;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "passwd")
	public WebElement password;

	@FindBy(id = "SubmitLogin")
	public WebElement submitSignIn;

	//read exceldata
	public void readExcelData() throws Exception {
	File excelSheet = new File("./ReadExcelData/TestData.xlsx");
	FileInputStream fis = new FileInputStream(excelSheet);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String user_name = sheet1.getRow(1).getCell(1).getStringCellValue();
	String password = sheet1.getRow(1).getCell(2).getStringCellValue();
	System.out.println(user_name);
	System.out.println(password);

	}

	//Specify ExcelSheet Path
//	public void readExcelData() throws Exception {
//		System.out.println("Helooooooooo");
//	File testData = new File("./ReadExcel/TestData.xlsx"); 
//	FileInputStream fis = new FileInputStream(testData);
//
//	//XSSF will load the entire ExcelSheet
//	XSSFWorkbook data = new XSSFWorkbook(fis);
//
//	//here it will read values from ExcelSheet 
//	XSSFSheet sheet1 =  data.getSheetAt(0);// here At index refers at which index the sheet is located.Its loaded the specific Sheet
//
//	//here which specifies which row and column is using
//	String data0 = sheet1.getRow(1).getCell(1).getStringCellValue();
//	System.out.println("Data from Excel is" + data0);
//	}

	public void openUrl() {
		driver.get(config.getUrl());
		driver.manage().window().maximize();
	}

	public void signIn() throws Exception {
		System.out.println("Helooooooooo");
		System.out.println("data is");
		objCOM.waitForElement(signIn);
		signIn.click();
		//scroll for element AlreadyRegistered
		WebElement alreadyReg = driver.findElement(By.xpath("//h3[contains(.,'Already registered?')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alreadyReg);
//		readExcelData();
//		email.sendKeys(user_name);
		
		
	}
		//scroll for element AlreadyRegistered
//		WebElement alreadyReg = driver.findElement(By.xpath("//h3[contains(.,'Already registered?')]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alreadyReg);
//		objCOM.waitForElement(email);
//		email.sendKeys("nikitha@gmail.com");
//		password.sendKeys("Nikitha@22");
//		submitSignIn.click();
//	}

//	public void verifyAccount() {
//		String myAccount = driver.findElement(By.xpath("//h1[contains(.,'My account')]")).getText();
//		System.out.println("actualvalue is = " + myAccount);
//		Assert.assertEquals("MY ACCOUNT", myAccount);
//	}

}
