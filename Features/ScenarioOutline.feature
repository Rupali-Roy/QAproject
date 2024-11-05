Feature: datadriven Login

  Scenario Outline: login
  Given user is on the home page
 When user enters "<username>" and "<password>" 
Then user should be able to login page

    Examples: 
      |username | password  |
      |Rupali   | Rupali123 |
      |Rupa     | Ru1234    |
      |Raja     | Ram12     |
