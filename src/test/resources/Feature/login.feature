#Author
#Date
#Description
Feature: Login Feature

  @tag1
  Scenario Outline: Check Login is Successful with Valid Credentials
    Given Application Launch
    When Application Open
    Then Validate Page Title "T&C and Privacy policy"
    And Accept Term & Condition
    And Click On Submit
    And Click on Continue
    Then Validate 3rd Page Title "Start your fitness journey"
    When Select Login as Email option
    Then Validate 4th Page Title "What’s your email id?"
    When Enter Email ID "<EmailID>"
    And Click on Continue
    Then Validate 5th Page Title "OTP, please"
    When Click on Use Password button
    Then Validate 6th Page Title "Password, please"
    When Enter Password "<Password>"
    And Click On Continue
    And Deny BlueTooth
    And Click on Pair Later button
    And Deny BlueTooth
    Then Validate Toast message "Login Success"
    Then Validate Home Page by Slider Image

    @tag1
    Examples: 
      | EmailID                  |  | Password |
      | arunsiddhu2010@gmail.com |  | arun131! |

  @tag2
  Scenario Outline: Check Login is Successful with Invalid EmailID
    Given Application Launch
    When Application Open
    Then Validate Page Title "T&C and Privacy policy"
    And Accept Term & Condition
    And Click On Submit
    And Click on Continue
    Then Validate 3rd Page Title "Start your fitness journey"
    When Select Login as Email option
    Then Validate 4th Page Title "What’s your email id?"
    When Enter Email ID "<EmailID>"
    And Enter
    Then Validate Toast message "Please enter a valid email address"

    @tag2
    Examples: 
      | EmailID                   |
      | arunsDGFFdhu2010@gail.con |

  @tag3
  Scenario Outline: Check Login is Successful with Invalid Password
    Given Application Launch
    When Application Open
    Then Validate Page Title "T&C and Privacy policy"
    And Accept Term & Condition
    And Click On Submit
    And Click on Continue
    Then Validate 3rd Page Title "Start your fitness journey"
    When Select Login as Email option
    Then Validate 4th Page Title "What’s your email id?"
    When Enter Email ID "<EmailID>"
    And Click on Continue
    Then Validate 5th Page Title "OTP, please"
    When Click on Use Password button
    Then Validate 6th Page Title "Password, please"
    When Enter Password "<Password>"
    And Click On Continue
    Then Validate Toast message "Invalid credentials"

    @tag3
    Examples: 
      | EmailID                  |  | Password   |
      | arunsiddhu2010@gmail.com |  | arun16731! |
     
