Feature:  Etsy Search Functionality

  Background: navigate
    Given the user naviagete to "https://www.etsy.com/"

  @regressionOutline
  Scenario Outline:  validation of etsy search Hat
#    Given the user naviagete to "https://www.etsy.com/"
    When  the user searches with "<searchvalue>"
    Then the user validate the title "<titlevalidation>"

    Examples:
      | searchvalue | titlevalidation |
      | hat         | Hat \| Etsy     |
      | Key         | Key \| Etsy     |
      | Pin         | Pin \| Etsy     |
