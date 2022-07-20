package stepdefination;

import org.testng.Assert;

import Browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Pages;

public class Cucumber1 
{
	@Given("User on the webpage {string}")
	public void user_on_the_webpage(String string) 
	{
		try
		{
			Browser.OpenBrowser();
			Browser.OpenURL(string);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("User passes the {string}")
	public void user_passes_the(String string) throws InterruptedException 
	{
		try
		{
			Pages.EnterTheUsername(string);
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("User enters the {string}")
	public void user_enters_the(String string) throws InterruptedException 
	{
		try
		{
			Pages.EnterThePassword(string);
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("Click on the LoginButton")
	public void click_on_the_login_button() throws InterruptedException 
	{
		try
		{
			Pages.ClickTheLoginButton();
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("User is navigate to product backlog page.")
	public void user_is_navigate_to_product_backlog_page() throws InterruptedException 
	{
		try
		{
			String actualTitle1 = Pages.NavigateTheProduct();
			Assert.assertEquals("Swag Labs", actualTitle1);
		}
		catch (AssertionError e)
		{
			e.printStackTrace();
		}
		Browser.BrowserClose();
	}
}
