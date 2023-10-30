package generic_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.google.common.io.Files;
import generic_Utility.A_BaseClass;

public class ListnersImplementationClass implements  ITestListener {
	
	E_JavaUtility jUtil=new E_JavaUtility();
	String sysTime=jUtil.generateSystemDateTime();
	public void onTestFailure(ITestResult result) {
	System.out.println("ListenerImplementation class is running");
	String TestCaseName=result.getMethod().getMethodName();
		
	TakesScreenshot ts = (TakesScreenshot) A_BaseClass.sdriver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("./ScreenShots/"+TestCaseName+"_"+sysTime+".png");
	try {
	Files.copy(source, destination);
	} 
	catch (IOException e) {
	e.printStackTrace();
	}
	
   }
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}