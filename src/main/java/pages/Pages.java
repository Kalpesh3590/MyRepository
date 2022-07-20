package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;
import Demo.DemoLog;

public class Pages extends Browser
{	
	public static void EnterTheUsername(String user)
	{
		DemoLog.Sample(2);
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("EnterTheUserName");
		logger.log(Status.INFO, "Entering the Username");
		try
		{
			DemoLog.Sample(1);
			driver.findElement(By.id("user-name")).sendKeys(user);
			logger.log(Status.PASS, "Username Entered successfully");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Entering the Username");
		}
		extents.flush();
	}
	public static void EnterThePassword(String pass)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("EnterThePassword");
		logger.log(Status.INFO, "Entering the Password");
		try
		{
			DemoLog.Sample(1);
			driver.findElement(By.id("password")).sendKeys(pass);
			logger.log(Status.PASS, "Password Entered successfully");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Entering the Password");
		}
		extents.flush();
	}
	public static void ClickTheLoginButton()
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ClickLoginButton");
		logger.log(Status.INFO, "Clicking the LoginButton");
		try
		{
			DemoLog.Sample(1);
			driver.findElement(By.id("login-button")).click();
			logger.log(Status.PASS, "Successfully clicked LoginButton");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Clicking the LoginButton");
		}
	}
	public static String NavigateTheProduct() throws InterruptedException
	{
		DemoLog.Sample(1);
		String abcde = driver.getTitle();
		return abcde;
	}
}
