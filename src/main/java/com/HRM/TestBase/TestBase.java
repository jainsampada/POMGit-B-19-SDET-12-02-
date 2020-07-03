package com.HRM.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase { 
public static WebDriver driver;
public static Properties prop;
public TestBase()
{
	try {
		FileInputStream ip=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\com.HRM.POM\\src\\main\\java\\com\\HRM\\configuration\\config.properties");
		prop=new Properties();
		prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void initialization()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	
}
	
	
}

