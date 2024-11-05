Feature: Login
Background: 
Given user is on the home page
@functional

Scenario: Valid Login
When user enters "Rupali" and "Rupali123" 
Then user should be able to login page

@regression

Scenario: Invalid Login
 When user enters Invalid credentials
Then user should not be able to login page

 
