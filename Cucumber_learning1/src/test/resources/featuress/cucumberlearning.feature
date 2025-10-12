Feature: Test the login functionality of OrangeHRM

Scenario Outline: Test the valid login
Given user is on loginpage
When user enters password
And click on login button
Then user should land on home page