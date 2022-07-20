package pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Browser.Browser;
import Demo.DemoLog;

public class Login_ProdBackLog extends Browser
{
	public static void OpenUrl(String a)
	{
		DemoLog.Sample(2);
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenTheURL");
		logger.log(Status.INFO, "Opening The Website");
		try
		{
			DemoLog.Sample(1);
			Browser.OpenBrowser();
			Browser.OpenURL(a);
			logger.log(Status.PASS, "Website is opened successfully");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Website is failed to open");
		}
		extents.flush();
	}
	public static void UserId(String userid)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("EnterTheUserName");
		logger.log(Status.INFO, "Entering the Username");
		try
		{
			DemoLog.Sample(1);
			Pages.EnterTheUsername(userid);
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
	public static void PassId(String passid)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("EnterThePassword");
		logger.log(Status.INFO, "Entering the Password");
		try
		{
			DemoLog.Sample(1);
			Pages.EnterThePassword(passid);
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
	public static void LogInBtn()
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ClickLoginButton");
		logger.log(Status.INFO, "Clicking the LoginButton");
		try
		{
			DemoLog.Sample(1);
			Pages.ClickTheLoginButton();
			logger.log(Status.PASS, "Successfully clicked LoginButton");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Clicking the LoginButton");
		}
		extents.flush();
	}
	public static void NextPg() throws InterruptedException
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("NextPage");
		logger.log(Status.INFO, "Next Page Opening");
		try
		{
			DemoLog.Sample(1);
			Pages.NavigateTheProduct();
			logger.log(Status.PASS, "Next Page is Opened Successfully");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Open NextPage");
		}
		extents.flush();
	}
	public static void Suser(String uid)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("EnterTheUserName");
		logger.log(Status.INFO, "Entering the Username");
		try
		{
			DemoLog.Sample(1);
			Pages.EnterTheUsername(uid);
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
	public static void Spass(String pass)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("EnterThePassword");
		logger.log(Status.INFO, "Entering the Password");
		try
		{
			DemoLog.Sample(1);
			Pages.EnterThePassword(pass);
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
	public static void Login_Button()
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("ClickLoginButton");
		logger.log(Status.INFO, "Clicking the LoginButton");
		try
		{
			DemoLog.Sample(1);
			Pages.ClickTheLoginButton();
			logger.log(Status.PASS, "Successfully clicked LoginButton");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Failed to Clicking the LoginButton");
		}
		extents.flush();
	}
	public static String ProdDetails() throws InterruptedException
	{
		
		DemoLog.Sample(1);
		String text = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
		System.out.println(text);
		return text;
	}
}
