Feature: To verify the fuctionality on a login page

Background: 
Given User is able to open the url "https://www.saucedemo.com/"


Scenario: To validate that user is able to login the website using valid username and password
And User is able to enter the UserId '<username>'
And User is pass the PassId '<password>'
When Tap on the login button
Then User should be navigated to the next page.
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|


Scenario: To validate that all the product displayed properly
And User entered the UserId "standard_user"
And User passed the PassId "secret_sauce"
When click on the login button
Then User should able to navigated to next page where he able to see the all the product details.