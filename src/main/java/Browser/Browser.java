package Browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import Demo.DemoLog;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports extents = new ExtentReports();
	public static ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReports/extentreport1.html");
	
	public static WebDriver OpenBrowser()
	
	{
		DemoLog.Sample(2);
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenBrowserTest");
		logger.log(Status.INFO, "Opening The Browser");
		try
		{
			DemoLog.Sample(1);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver,Duration.ofSeconds(50));
			logger.log(Status.PASS, "Browser is opened successfully");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Browser is failed to open");
		}
		extents.flush();
		return driver;
		
	}
	public static void OpenURL(String web_url)
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("OpenTheURL");
		logger.log(Status.INFO, "Opening The Website");
		try
		{
			DemoLog.Sample(1);
			driver.get(web_url);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
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
	public static  String GetTitle()
	{
		DemoLog.Sample(1);
		String abcd = driver.getTitle();
		return abcd;
	}
	public static void BrowserClose() throws InterruptedException
	{
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("CloseBrowserTest");
		logger.log(Status.INFO, "Closing The Website");
		try
		{
			DemoLog.Sample(1);
			Thread.sleep(800);
			driver.quit();
			DemoLog.Sample(5);
			logger.log(Status.PASS, "Browser is closed successfully");
		}
		catch (Exception e)
		{
			DemoLog.Sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "Browser is failed to close");
		}
		extents.flush();
		
		
	}
}
