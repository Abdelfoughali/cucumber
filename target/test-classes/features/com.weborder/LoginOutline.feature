@signpractice
Feature: Login functionality for webOrder page

  Background:
    Given the user navigate to the webOrder website


  Scenario: Validation of webOrder Login Positive Scenario
    When the user provides credentials
    Then the user is on the home page


  Scenario Outline: Validation of WebOrder Login Negative Scenario 2
    When the user provides wrong "<username>" and  "<password>"
    Then the user validates "<errormessage>" error message

  #do not touch the positive scenario
  #create as many as negative scenario with scenario outline

    Examples:
      | username              | password  |  | errormessage   |
      | jafar                 | foughali  |  | Sign in Failed |
      | abdel                 | Guest1!   |  | Sign in Failed |
      | sarah                 | foughali1 |  | Sign in Failed |
      |                       |           |  | Sign in Failed |
      |                       | Guest1!   |  | Sign in Failed |
      | sarah                 | foughali1 |  | Sign in Failed |
      | jafar                 | foughali  |  | Sign in Failed |
      |                       | Guest1!   |  | Sign in Failed |
     | guest1@microworks.com | Guest1!iii   |  | Sign in Failed |