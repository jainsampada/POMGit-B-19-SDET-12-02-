package com.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.HRM.TestBase.TestBase;
import com.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage oo;
	String title;
	public LoginTest()
	{
		super();
	}
	@BeforeSuite
	public void Launch()
	{
		initialization();
		oo=new LoginPage();
	}
	@Test
	public void CheckTitle()
	{
		title=oo.verifyTitle();
		System.out.println("Title is:"+title);
	}
	@Test
	public void Loginn()
	{
		oo.Login();
	}

}
