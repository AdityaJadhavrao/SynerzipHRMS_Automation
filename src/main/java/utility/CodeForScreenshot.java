package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.Automation_HRMSapplication.BaseClass;

public class CodeForScreenshot extends BaseClass {

	public static String  ScreenshotMethod(String filename) throws IOException
	{
		TakesScreenshot file = (TakesScreenshot)driver;
		File src= file.getScreenshotAs(OutputType.FILE);
		String trg = System.getProperty("user.dir")+"/ScreenshotOfFailedTestCases/"+filename+".png";
		//File des= new File("/home/excellarate/eclipse-workspace/Synerzip_Automation/ScreenshotOfFailedTestCases"+".png");
		File target = new File(trg);
		FileHandler.copy(src, target);
		
		return trg;
	}
	public CodeForScreenshot()
	{
		PageFactory.initElements(driver, this);
	}

}
