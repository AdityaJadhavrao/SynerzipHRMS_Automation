package com.qa.Automation_HRMSapplication;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyInfoClass extends BaseClass{
	
	@FindBy(xpath="//*[text()='My Info']")
	private WebElement myInfoTab;
	public void myInfoTabMethod() throws InterruptedException
	{
		myInfoTab.click();	
		Thread.sleep(3000);
	}
	@FindBy(xpath="//*[text()='Prithviraj Satyendra Jadhavrao']")
	private WebElement myName;
	public String myNameMethod()
	{
		return myName.getText();
	}
	@FindBy(xpath="//*[@id='btnSave']")
	private WebElement editBtn;
	public void editMethod() throws InterruptedException
	{
		JavascriptExecutor j =(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0, 700)");
		editBtn.click();
		Thread.sleep(2000);
	}
	@FindBy(xpath="//*[@id='personal_txtEmpFirstName']")
	private WebElement name;
	public void firstNameMethod(String usrfirstname) throws InterruptedException
	{
		JavascriptExecutor jd =(JavascriptExecutor)driver;
		jd.executeScript("scrollBy(0,-700)");
		name.clear();
		name.sendKeys(usrfirstname);
		Thread.sleep(3000);
	}
	@FindBy(xpath="//*[@id='personal_txtEmpMiddleName']")
	private WebElement middlename;
	public void middleNameMethod(String usrmiddlename)
	{
		middlename.clear();
		middlename.sendKeys(usrmiddlename);
	}
	@FindBy(xpath="//*[@id='personal_txtEmpLastName']")
	private WebElement lastname;
	public void lastNameMethod(String usrlastname)
	{
		lastname.clear();
		lastname.sendKeys(usrlastname);
	}
	@FindBy(xpath="//*[@id='personal_txtEmpFatherName']")
	private WebElement fathersname;
	public void fathersNameMethod(String usrfathersname)
	{
		fathersname.clear();
		fathersname.sendKeys(usrfathersname);
	}
	@FindBy(xpath="//*[@id='personal_txtEmpMotherName']")
	private WebElement mothername;
	public void mothersNameMethod(String usrmothersname)
	{
		mothername.clear();
		mothername.sendKeys(usrmothersname);
	}
	@FindBy(xpath="//*[@id='personal_txtEmpHusbandName']")
	private WebElement spouse;
	public void spouseIdMethod()
	{
		spouse.isEnabled();
	}
	@FindBy(xpath="//*[@id='personal_txtEmployeeId']")
	private WebElement persId;
	public void personalIdMethod()
	{
		persId.isDisplayed();
	}
	@FindBy(xpath="//*[@id='personal_txtOtherID']")
	private WebElement othrId;
	public void otherIdMethod()
	{
		othrId.isEnabled();
	}
	@FindBy(xpath="//*[@id='personal_optGender_1']")
	private WebElement radioBtn;
	public void genderButton()
	{
		radioBtn.click();
	}
	@FindBy(xpath="//*[@id='personal_cmbMarital']")
	private WebElement dropdown;
	public void maritialStatusMethod()
	{
		dropdown.click();
		Select s = new Select(dropdown);
		s.selectByVisibleText("Single");
	}
	@FindBy(xpath="//*[@id='personal_DOB']")
	private WebElement calendar;
	public void dateOfBirthMethod() throws InterruptedException
	{
		calendar.isDisplayed();
		Thread.sleep(3000);
	}
	@FindBy(xpath="//*[@id='personal_Bldgp']")
	private WebElement bldgroup;
	public void bloofGroupMethod()
	{
		bldgroup.isDisplayed();
	}
	@FindBy(xpath="//*[@id='personal_cmbphyChallenge']")
	private WebElement disablity;
	public void physicallyChallengeMethod() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(500, 500)");
		Thread.sleep(3000);
		disablity.click();
		Select sd = new Select(disablity);
		sd.selectByVisibleText("No");
	}
	@FindBy(xpath="//*[@id='btnSave']")
	private WebElement saveBtn;
	public void saveButtonMethod()
	{
		saveBtn.click();	
	}
	
	public void allMethods(String first,String middle,String last,String fathername,String mothersname) throws InterruptedException
	{
		myInfoTabMethod();
		editMethod();
		firstNameMethod(first);
		middleNameMethod(middle);
		lastNameMethod(last);
		fathersNameMethod(fathername);
		mothersNameMethod(mothersname);
		spouseIdMethod();
		personalIdMethod();
		otherIdMethod();
		genderButton();
		maritialStatusMethod();
		dateOfBirthMethod();
		bloofGroupMethod();
		physicallyChallengeMethod();
		saveButtonMethod();
	}
	
	@FindBy(xpath="//*[@id='addLanguage']")
	private WebElement addBtn;
	public void addMethod() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0, 700)");
		Thread.sleep(3000);
		addBtn.click();
	}
	@FindBy(xpath="//*[@id='language_code']")
	private WebElement langdropdown;
	public void selectLanguageMethod()
	{
		Select lan = new Select(langdropdown);
		lan.selectByVisibleText("English");
	}
	@FindBy(xpath="//*[@id='language_1_competency_3']")
	private WebElement proficencyInWriting;
	public void writingProficiencyMethod()
	{
		proficencyReading.click();
	}
	@FindBy(xpath="//*[@id='language_2_competency_3']")
	private WebElement proficencyInSpeaking;
	public void proficiencySpeakingMethod()
	{	
		proficencyInSpeaking.click();
	}
	@FindBy(xpath="//*[@id='language_3_competency_3']")
	private WebElement proficencyReading;
	public void proficiencyInReadingMethod()
	{
		proficencyReading.click();
	}
	@FindBy(xpath="//*[@id='btnLanguageSave']")
	private WebElement savelanguage;
	public void saveLanguageMethod()
	{
		savelanguage.click();
	}
	
	@FindBy(xpath="//*[@id='addLanguage']")
	private WebElement addButton;
	public void addLanguageMethod()
	{
		addButton.click();
	}
	@FindBy(xpath="//*[@id='language_code']")
	private WebElement selectLang;
	public void selectLanguage2Method()
	{
		selectLang.click();
		Select d = new Select(selectLang);
		d.selectByVisibleText("Marathi");
	}
	@FindBy(xpath="//*[@id='language_1_competency_3']")
	private WebElement proWriting;
	public void proficiencyinWriting()
	{
		proWriting.click();
	}
	@FindBy(xpath="//*[@id='language_2_competency_3']")
	public WebElement proSpeaking;
	public void proficiencyinSpeaking()
	{
		proSpeaking.click();
	}
	@FindBy(xpath="//*[@id='language_3_competency_3']")
	private WebElement proReading;
	public void proficiencyinReading()
	{
		proReading.click();
	}
	@FindBy(xpath="//*[@id='btnLanguageSave']")
	private WebElement saveButton;
	public void saveButtuonMethod()
	{
		saveButton.click();
	}
	@FindBy(xpath="//*[@class='message success fadable']")
	private WebElement message;
	public String  successfulMessage()
	{
		return message.getAttribute("class");
	}
	public void languageMethod() throws InterruptedException
	{
		addMethod();
		selectLanguageMethod();
		writingProficiencyMethod();
		proficiencySpeakingMethod();
		proficiencyInReadingMethod();
		saveLanguageMethod();
		
		addLanguageMethod();
		selectLanguage2Method();
		proficiencyinWriting();
		proficiencyinSpeaking();
		proficiencyinReading();
		saveButtuonMethod();
		Thread.sleep(2000);
		successfulMessage();
	}
	@FindBy(xpath="(//*[text()='Contact Details'])[1]")
	private WebElement details;
	public void contactDetailsMethod()
	{
		Actions act = new Actions(driver);
		act.moveToElement(details).click().build().perform();
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,500)");
	}
	@FindBy(xpath="//*[@id='contact_emp_mobile']")
	private WebElement mono;
	public String mobileNumberMethod()
	{
		return mono.getAttribute("value");
	}
	public MyInfoClass()
	{
		PageFactory.initElements(driver, this);
	}

}
