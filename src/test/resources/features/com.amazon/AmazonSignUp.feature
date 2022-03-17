@amazon
Feature: testing Amazon SignUp Functionality

  Background: navigate

  Scenario: Amazon SingUp with dataBase
    When  the user clicks the sign in and create your amazon account button
    Then  the user validate the header
      | Create account |
    And  the user provides the informations:
      | jafar           |
      | ahmet@gmail.com |
      | jafar123        |
      | jafar123        |