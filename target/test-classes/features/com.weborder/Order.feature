
@regression
Feature: WebOrder Page Food Order

  Background:
    Given The user is on the web order homepage
    When the user selects "Office" options
    And  the user is on the groupOrderPage
    And  the user sends invitatees note "Test"
    And the user send invite list "jafar@gmail.com" and "abdel@gmail.com"
  Scenario: Validation Of Food Order For Office
#   Given The user is on the web order homepage
#    When the user selects "Office" options
#    And  the user is on the groupOrderPage
#    And  the user sends invitatees note "Test"
#    When the user send invite list "jafar@gmail.com" and "abdel@gmail.com"
    And  the user validates the "2012 EMPIRE BLVD" adress
   And the user validates "View Group Order" text
  And the user validates total particaipants is 1

  Scenario: Validation Of Food Order For House
##    Given The user is on the web order homepage
#    When the user selects "My House" options
#    And  the user is on the groupOrderPage
#    And  the user sends invitatees note "Test"
#    And the user send invite list "jafar@gmail.com" and "abdel@gmail.com"
    And the user selects "My House" options
    And  the user validates the "2112 EMPIRE BLVD" adress
    *  the user validates "View Group Order" text
    * the user validates total particaipants is 1