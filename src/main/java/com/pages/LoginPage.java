package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.TestBase.TestBase;

public class LoginPage extends TestBase {
@FindBy(name="txtUserName")
WebElement uname;

@FindBy(name="txtPassword")
WebElement pass;

@FindBy(name="Submit")
WebElement login;
public LoginPage()
{
	PageFactory.initElements(driver, this);
}

public String verifyTitle()
{
	return driver.getTitle();
}

public void Login()
{
	uname.sendKeys(prop.getProperty("username"));
	pass.sendKeys(prop.getProperty("password"));
	login.click();
}
}
