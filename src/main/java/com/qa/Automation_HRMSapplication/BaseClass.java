package com.qa.Automation_HRMSapplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties pro;
	
	@BeforeSuite
	public void setup() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		pro = new Properties();
		FileInputStream file = new FileInputStream("/home/excellarate/eclipse-workspace/Synerzip_Automation/src/main/resources/config.properties");
		pro.load(file);	
		driver.get(pro.getProperty("URL"));
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}



