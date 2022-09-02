package com.qa.Automation_HRMSapplication;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;





public class LoginClass extends BaseClass {
	
			@FindBy(xpath="//*[@src='/symfony/web/webres_60058c65b8b865.35299599/themes/default/images/Syn-Big-Logo.gif']")
		    private WebElement logo;
		    public String logo() throws InterruptedException
		    {
		        return logo.getAttribute("alt");
		    }
		    @FindBy(xpath="//*[text()='Forgot your password?']")
		    private WebElement frgpswd;
		    public String forgetPassword()
		    {
		       return frgpswd.getText();
		    }
		    @FindBy(xpath="//*[text()='Sign In']")
		    private WebElement signIn;
		    public String siginTab()
		    {
		        return signIn.getText();
		    
		    }
		    @FindBy(xpath="//*[@class='btn  btn-social btn-google']")
		    private WebElement signinG;
		    public String signInWithGoogle()
		    {
		        return signinG.getAttribute("class");
		    
		    }
		    @FindBy(xpath="//*[@href='https://www.linkedin.com/company/synerzip']")
		    private WebElement linkedIN;
		    public String linkedInBtn()
		    {
		        return linkedIN.getAttribute("href");
		    }
		    @FindBy(xpath="//*[@href='https://www.facebook.com/Synerzip']")
		    private WebElement facebk;
		    public String  facebookBtn()
		    {
		        return facebk.getAttribute("href");
		    
		    }
		    @FindBy(xpath="//*[@href='https://twitter.com/Synerzip_Agile']")
		    private WebElement twitter;
		    public String twitterBtn()
		    {
		        return twitter.getAttribute("href");
		                
		    }
		    @FindBy(xpath="//*[@href='https://www.youtube.com/user/SynerzipWebiChannel']")
		    private WebElement youtube;
		    public String  youtubeBtn()
		    {
		        return youtube.getAttribute("href");
		        
		    }
		    @FindBy(xpath="//*[@src='https://www.positivessl.com/images-new/PositiveSSL_tl_trans2.png']")
		    private WebElement sslcertificate;
		    public String sslCertification()
		    {
		        return sslcertificate.getAttribute("alt");
		    }
		    public void allElements() throws InterruptedException
		    {
		        logo();
		        forgetPassword();
		        siginTab();
		        signInWithGoogle();
		        linkedInBtn();
		        facebookBtn();
		        twitterBtn();
		        youtubeBtn();
		        sslCertification();
		    }
		    
		    @FindBy(xpath="//*[@id='txtUsername']")
		    private WebElement username;
		    public void usernameMethod(String usrname)
		    {
		
		    	username.sendKeys(usrname);
		    }
	
		    @FindBy(xpath="//*[@id='txtPassword']")
		    private WebElement password;
		    public void passwordMethod(String usrpswd)
		    {
		    	password.sendKeys(usrpswd);
		    }
	
		    @FindBy(xpath="//*[@id='btn-login']")
		    private WebElement loginbtn;
		    public HomePageClass login(String Username,String Password)
		    {
		    	usernameMethod(Username);
		    	passwordMethod(Password);
		    	loginbtn.click();
		    	HomePageClass obj = new HomePageClass();
		    	return obj;
		    }
	
		    @FindBy(xpath="//*[@id='welcome']")
		    private WebElement welcome;
		    public void welcomePrithviraj()
		    {
		    	welcome.click();
		    }
	
		    @FindBy(xpath="//*[text()='Logout']")
		    private WebElement logout;
		    public void logoutBtn()
		    {
		    	logout.click();
		    }
	
		    @FindBy(xpath="//*[@id='txtUsername']")
		    private WebElement invalidUsername;
		    public void invalidUsernameMethod(String inusername)
		    {		
		    	invalidUsername.sendKeys(inusername);
		    }
	
		    @FindBy(xpath="//*[@id='txtPassword']")
		    private WebElement invalidPassword;
		    public void invalidPasswordMethod(String inpassword)
		    {
		    	invalidPassword.sendKeys(inpassword);
		    }
		    @FindBy(xpath="//*[@id='btn-login']")
		    private WebElement loginbutton;
		    public HomePageClass inavlidlLogin(String invalidUsername, String invalidPassword) 
		    {
		    	welcomePrithviraj();
		    	logoutBtn();
		    	invalidUsernameMethod(invalidUsername);
		    	invalidPasswordMethod(invalidPassword);
		    	loginbutton.click();
		
		    	HomePageClass homeobj= new HomePageClass();
		    	if(loginbutton.equals(homeobj))
		    	{
		    		return homeobj;
		    	}
		    	else
		    	{
		    		return null;
		    	}
		    }
		    @FindBy(xpath="//*[text()='Invalid credentials']")
		    private WebElement error;
		    public String errorMessage()
		    {
		    	return error.getText();
		    }
		    public LoginClass()
		    {		
		    	PageFactory.initElements(driver, this);
		    }
	}	
