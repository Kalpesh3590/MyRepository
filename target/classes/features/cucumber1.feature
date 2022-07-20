Feature: To verifying the login fuctionality.
Scenario: Checking the fuctionality for valid data.
Given User on the webpage "https://www.saucedemo.com/"
And User passes the '<useername>'
And User enters the '<password>'
When Click on the LoginButton
Then User is navigate to product backlog page.
Examples:
|useername|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|