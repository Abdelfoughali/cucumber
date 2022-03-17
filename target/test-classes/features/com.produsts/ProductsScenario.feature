Feature: validation of products

  @productProject
  Scenario: validation of the new products creation
    Given the user navigate to product website homepage and click orderButton
    When  the user enters the products information "MyMoney" and "4"
    And  the user enters the adress information "Techtorial","2200 E Devon ave","Des Plaines","IL","6001"
    And  the user enter the card information "Visa","234567","09/24"
    Then the user validate success message
    And the user vslidates products details "Techtorial","MyMoney","4","2200 E Devon ave","Des Plaines","IL","6001","Visa","234567","09/24"

  @productProjectOutline
  Scenario Outline: Validation of New Product Creation
    Given the user navigate to product website homepage and click orderButton
    When the user enters the products information "<productName>" and "<quantity>"
    And the user enters the adress information "<customerName>","<street>","<city>","<state>","<zipcode>"
    And the user enter the card information "<cardType>","<cardNumber>","<expireDate>"
    Then the user validate success message
    And the user vslidates products details "<customerName>","<productName>","<quantity>","<street>","<city>","<state>","<zipcode>","<cardType>","<cardNumber>","<expireDate>"

    Examples:
      | productName | quantity | customerName | street           | city        | state | zipcode | cardType         | cardNumber | expireDate |
      | MyMoney     | 4       | Techtorial   | 2200 E Devon ave | Des Plaines | IL    | 6001    | Visa             | 234567     | 09/24      |
     | MyMoney     | 5        | jafar        | foughali         | maamar      | tz    | 6033    | MasterCard       | 23456712   | 09/23      |
      | MyMoney       | 45       | Techtorial   | 2200 E touhy ave | dem         | qL    | 6001    | American Express | 234567     | 09/45      |
      | MyMoney       | 5      | Techtorial   | 2200 E touhy ave | dem         | qL    | 6001    | American Express | 234567     | 09/45      |