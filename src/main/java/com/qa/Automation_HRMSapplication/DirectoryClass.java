package com.qa.Automation_HRMSapplication;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryClass extends BaseClass{
	
	@FindBy(xpath="//*[@id='menu_pim_viewDirectory']")
	private WebElement directory;
	public void directoryTab()
	{
		Actions act = new Actions(driver);
		act.moveToElement(directory).click().build().perform();
	}
	@FindBy(xpath="//*[@id='empDir_job_title']")
	private WebElement jobtititle;
	public void selectJobTitle() throws InterruptedException
	{
		Actions a = new Actions(driver);
		a.moveToElement(jobtititle).click().build().perform();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(2000);
	}
	@FindBy(xpath="//*[@id='searchBtn']")
	private WebElement search;
	public void searchButton()
	{
		search.click();	
	}
	@FindBy(xpath="//*[text()='US13, Julie Foster']")
	private WebElement name;
	public String deatilsOfAccountingManager()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		return name.getText();
	}
	public DirectoryClass()
	{
		PageFactory.initElements(driver, this);
	}
}
