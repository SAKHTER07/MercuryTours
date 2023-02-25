package com.mercury.tours.util;

/**
 * *********************************************************************************
 * @author sakhter
 * Class Name: TestNGListener
 * Description: 
 * Reviewer Name:
 * Comments:
 * **********************************************************************************
 */
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
	@Override
	public void onFinish(ITestContext result) {

	}
	@Override
	public void onStart(ITestContext result) {

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and details are "+result.getName());		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases skipped and details are "+result.getName());	
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases started and details are "+result.getName());	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases succeed and details are "+result.getName());		
	}
	/**
	 * ******************************************************************************************************************************************
	 *                                        >>>>>>>>>>>> End of the file <<<<<<<<<<<<
	 * ******************************************************************************************************************************************
	 */
}