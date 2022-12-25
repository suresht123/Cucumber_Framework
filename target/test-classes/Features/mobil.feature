Feature: mobil

  Background: 
    Given user enter Amazon url

  Scenario: add to cart
    When user search the mobile
    And user select the mobile
    Then user add to cart mobile

  Scenario: add to cart
    When user search the mobile by using oneD list
      | vivo | realme | redmi |
    And user select the mobile
    Then user add to cart mobile

  Scenario: add to cart
    When user search the mobile by using oneD map
      | mobile1 | realme |
      | mobile2 | vivo   |
      | mobile3 | redmi  |
    And user select the mobile
    Then user add to cart mobile

  Scenario Outline: add to cart
    When user search the mobile "<MOBILE>"
    And user select the mobile
    Then user add to cart mobile

    Examples: 
      | MOBILE |
      | REALME |
      | redmi  |
      | VIVO   |
