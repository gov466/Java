package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import test.Ntest;

public class Listener implements ITestListener {
	
	Ntest n = new Ntest();
	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test Passed =" +result.getMethod());
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test failed =" +result.getMethod());

		TakesScreenshot s=((TakesScreenshot)n.driver);
		File src=s.getScreenshotAs(OutputType.FILE);
		String location="target/"+result.getName(); //snapshot saved under method name
		File destination= new File(location);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {

	}
	public void onTestFailedWithSuccessPercentage(ITestResult result) {

	}
	public void onStart(ITestResult result) {

	}
	public void onFinish(ITestResult result) {

	}

}
