package com.qa.Automation_HRMSapplication_Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.Automation_HRMSapplication.BaseClass;
import com.qa.Automation_HRMSapplication.DirectoryClass;
import com.qa.Automation_HRMSapplication.HomePageClass;
import com.qa.Automation_HRMSapplication.LoginClass;
import com.qa.Automation_HRMSapplication.MyInfoClass;
import com.qa.Automation_HRMSapplication.TestNglistnersForScreenshot;
@Listeners(TestNglistnersForScreenshot.class)
public class TestClass extends TestNglistnersForScreenshot {
	
	LoginClass objectOfLoginClass;
	HomePageClass objhomepage;
	MyInfoClass objectOfMyInfo;
	DirectoryClass objectofDirectory;
	
	@Test(priority=1)
	public void loginFunctionality() throws InterruptedException
	{
		objectOfLoginClass= new LoginClass();
		
		objectOfLoginClass.allElements();
		Assert.assertEquals(objectOfLoginClass.logo(), "Synerzip - HRMS");
        Assert.assertEquals(objectOfLoginClass.forgetPassword(), "Forgot your password?");
	    Assert.assertEquals(objectOfLoginClass.siginTab(), "Sign In");
	    Assert.assertEquals(objectOfLoginClass.signInWithGoogle(), "btn  btn-social btn-google");
	    Assert.assertEquals(objectOfLoginClass.linkedInBtn(), "https://www.linkedin.com/company/synerzip");
	    Assert.assertEquals(objectOfLoginClass.facebookBtn(), "https://www.facebook.com/Synerzip");
	    Assert.assertEquals(objectOfLoginClass.twitterBtn(), "https://twitter.com/Synerzip_Agile");
	    Assert.assertEquals(objectOfLoginClass.youtubeBtn(), "https://www.youtube.com/user/SynerzipWebiChannel");	      
        Assert.assertEquals(objectOfLoginClass.sslCertification(), "SSL Certificate");
		
		objhomepage=objectOfLoginClass.login(pro.getProperty("username"),pro.getProperty("password"));	
		Assert.assertEquals(objhomepage.homeTab(), "Home");
		Assert.assertEquals(objhomepage.attendaceTab(), "Attendance");	
	}
	@Test(dependsOnMethods="loginFunctionality")
	public void homePageCalendarIndentification()
	{
		objhomepage = new HomePageClass();
		
		objhomepage.calendarVerfication();
		Assert.assertEquals(objhomepage.monthYearVerification(),"September 2022");
		//Assert.assertEquals(objhomepage.colorIdentification(), false)
	}
	@Test(dependsOnMethods="homePageCalendarIndentification")
	public void myInfo() throws InterruptedException
	{
		objectOfMyInfo = new MyInfoClass();	
		
		objectOfMyInfo.allMethods(pro.getProperty("FirstName"),pro.getProperty("MiddleName"), pro.getProperty("LastName"), pro.getProperty("Father'sName"), pro.getProperty("Mother'sName"));
		objectOfMyInfo.languageMethod();
		objectOfMyInfo.contactDetailsMethod();
		Assert.assertEquals(objectOfMyInfo.myNameMethod(), "Prithviraj Satyendra Jadhavrao");
		//Assert.assertEquals(objectOfMyInfo.successfulMessage(), "message success fadable");
		Assert.assertEquals(objectOfMyInfo.mobileNumberMethod(), "9975761139");
	}
	@Test(dependsOnMethods="myInfo")
	public void directoryFunctionality() throws InterruptedException
	{
		objectofDirectory = new DirectoryClass();
		
		objectofDirectory.directoryTab();
		objectofDirectory.selectJobTitle();
		objectofDirectory.searchButton();
		Assert.assertEquals(objectofDirectory.deatilsOfAccountingManager(), "US13, Julie Foster");
	}
	@Test(dependsOnMethods="directoryFunctionality")
	public void invalidLoginMethod()
	{
		objectOfLoginClass.welcomePrithviraj();
		objectOfLoginClass.logoutBtn();
		objectOfLoginClass.login(pro.getProperty("invalidUsername"),pro.getProperty("invalidPassword"));
		Assert.assertEquals(objectOfLoginClass.errorMessage(), "Invalids credentials");
	}	
}
	
