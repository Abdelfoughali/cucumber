Feature: Login functionality for webOrder page

Background:
  Given the user navigate to the webOrder website
  @smoke
  Scenario: Validation of webOrder Login Positive Scenario
#    Given the user navigate to the webOrder website
    When the user provides credentials
    Then the user is on the home page

    Scenario: Validation of WebOrder Login Negative Scenario 1
     # Given the user navigate to the webOrder website
      When the user provides correct user name and wrong password
      Then the user validates "Sign in Failed" error message



  Scenario: Validation of WebOrder Login Negative Scenario 2
    #Given the user navigate to the webOrder website
    When the user provides wrong "jafar" and  "foughali"
    Then the user validates "Sign in Failed" error message

    # last scenario 3 should be prvoded blank for both
  # and validate the  same message . parameters are not necessary
@regression
  Scenario: Validation of WebOrder Login Negative Scenario 3
   # Given the user navigate to the webOrder website
    When the user provides wrong  username and  password
    Then the user validates "Sign in Failed" error message