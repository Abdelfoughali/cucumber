Feature: Open MRS tests

  @openMRS
  Scenario: register a patient
    Given the user logs into OpensMrs with following credentials
      | username | admin    |
      | password | Admin123 |
    When  the user register a a patient with following information:
      | GivenName    | jafar            |
      | FamilyName   | Foughali         |
      | Gender       | Male             |
      | Day          | 13               |
      | Month        | August           |
      | Year         | 1991             |
      | Address      | 2200 E devon ave |
      | PhoneNumber  | 3146564838       |
      | Relative     | Doctor           |
      | RelativeName | potel            |
Then the user validate the patient name and familyName
    |GivenName|jafar|
    |Familly|Foughali|