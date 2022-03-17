
@regression
Feature:  Etsy Search Functionality
  Background: navigate
    Given the user naviagete to "https://www.etsy.com/"


@hat @tc1 @smoke @regression
  Scenario:  validation of etsy search Hat
#    Given the user naviagete to "https://www.etsy.com/"
    When  the user searches with "hat"
    Then the user validate the title "Hats | Etsy"
  @key @tc2 @smoke @regression
  Scenario:  validation of etsy search Key
#    Given the user naviagete to "https://www.etsy.com/"
    When  the user searches with "Key"
    Then the user validate the title "Key | Etsy"

  @pin @tc3 @smoke
  Scenario:  validation of etsy search Pin
#    Given the user naviagete to "https://www.etsy.com/"
    When  the user searches with "Pin"
    Then the user validate the title "Pin | Etsy"