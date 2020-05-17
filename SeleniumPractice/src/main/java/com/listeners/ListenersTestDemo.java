package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestDemo implements ITestListener{

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On start");
		
		//Get the db connection
	}
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test success");
		String testName=result.getTestName();//test_100
		String testId=testName.split("_")[1];//100
		//update result is pass with id testId
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test Failure");
		String testName=result.getTestName();//test_100
		String testId=testName.split("_")[1];//100
		//update results is fail
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On finish");
		//Close the DB connection
	}

}
