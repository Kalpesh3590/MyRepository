package stepdefination;

import org.testng.Assert;

import Browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber 
{
	@Given("Open the Browser.")
	public void open_the_browser() 
	{
		try
		{
			Browser.OpenBrowser();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("Enter the URL. {string}")
	public void enter_the_url(String string) 
	{
		try
		{
			Browser.OpenURL(string);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("Page is displayed.")
	public void page_is_displayed() throws InterruptedException 
	{
		try
		{
			String actualTitle = Browser.GetTitle();
			Assert.assertEquals("Swag Labs", actualTitle);
		}
		catch (AssertionError e)
		{
			e.printStackTrace();
		}
		Browser.BrowserClose();
	}
	
}
