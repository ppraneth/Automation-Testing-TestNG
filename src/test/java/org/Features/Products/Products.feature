Feature: Products
  Background:
    Given User on login page
    Then user enters user name and password
    When user clicks on login button

  Scenario: User  on products
    When User clicks on product page
    And User selects Mens Category
    Then User clicks on Tshirt
    And User Select a Tshirt
    Then User adds it to cart