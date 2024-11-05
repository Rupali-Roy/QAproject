Feature: Login
Background: 
Given user is on the home page

Scenario: Valid Login
When user enters valid credentials
Then user should be able to login page