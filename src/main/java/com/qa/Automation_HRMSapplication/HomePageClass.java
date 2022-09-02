package com.qa.Automation_HRMSapplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageClass extends BaseClass{
	
	@FindBy(xpath="//*[text()='Home']")
	private WebElement home;
	public String homeTab()
	{
		return home.getText();
	}
	
	@FindBy(xpath="//*[text()='Attendance']")
	private WebElement attendance;
	public String attendaceTab()
	{
		return attendance.getText();
		
	}
	@FindBy(xpath="//*[@id='calendar']")
	private WebElement calendar;
	public void calendarVerfication()
	{
		driver.findElement(By.xpath("//*[@id='panel-calender']"));
	    DateFormat date = new SimpleDateFormat("YYYY-MM-dd");
	    Date d =new Date();
	    String currentSystemDate=date.format(d);
	    String monthYear="September 2022";

	    List<WebElement> numberoFRows = driver.findElements(By.xpath("//div[@class='fc-row fc-week ui-widget-content']"));
	    int row=numberoFRows.size();
		    
	    for(int i=1;i<=row;i++)
		   {
		      List<WebElement> numberofCells = driver.findElements(By.xpath("(//div[@class='fc-row fc-week ui-widget-content']["+i+"]/div/table/tbody/tr)[1]/td"));
		      int coloum=numberofCells.size();
		      for(int j=0;j<coloum;j++)
		      {            
		         if(currentSystemDate.equals(numberofCells.get(j).getAttribute("data-date")))
		         {
		             System.out.println("Current date is:"+currentSystemDate);   
		         }
		        }
		    }
	}
	@FindBy(xpath="//*[@class='fc-center']//child::h2")
	private WebElement monthYear;
	public String monthYearVerification()
	{
		String actualMonthYear="September 2022";
		return monthYear.getText();
	}
	@FindBy(xpath="//*[contains(@class,' ui-state-highlight')][1]")
	private WebElement actualColor;
	public String colorIdentification()
	{
		return actualColor.getAttribute("data-date");
	}
	
	public HomePageClass()
	{
		PageFactory.initElements(driver, this);
	}
}
