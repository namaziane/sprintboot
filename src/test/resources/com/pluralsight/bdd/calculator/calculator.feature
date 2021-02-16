Feature: calcular

  Scenario: Adding two numbers
    Given a have a calculator
    When I add 1.0 and 2.0
    Then I should have 3.0

  Scenario: Adding two numbers
    Given a have a calculator
    When I add 2.0 and 7.0
    Then I should have 9.0

  Scenario: Substracting two numbers
    Given a have a calculator
    When I substract 1.0 from 2.0
    Then I should have -1.0

  Scenario: Substracting two numbers
    Given a have a calculator
    When I substract 11.0 from 9.0
    Then I should have 2.0

  Scenario: Dividing two numbers
    Given a have a calculator
    When I divide 1.0 from 2.0
    Then I should have 0.5

  Scenario: Dividing two numbers
    Given a have a calculator
    When I divide 100.0 from 4.0
    Then I should have 25.0

  Scenario: Substracting two numbers
    Given a have a calculator
    When I substract 11.0 from 9.0
    Then I should have 2.0

  Scenario: Substracting two numbers
    Given a have a calculator
    And his favorite flavirs are :
      | Banana |
      | Apple  |
    And his favorite flavirs are2 :
      | Banana | 1   |
      | Apple  | 112 |
    And his favorite flavirs are3 :
      | Product | Type |
      | Banana  | 1    |
      | Apple   | 112  |
    And Qlqchose his favorite flavirs are4 :
      | Product | Type |
      | Banana  | 1    |
      | Apple   | 112  |
    When she has some great a hisbend and he matches all to things how hase he
    And he has some great an hisbend and she matches all to things how hase she
    And she orders 2 GreenGoodsness smothy
    And he orders 2 GreenGoodsness smothy
    And she has ordered 2 GreenGoodsness smothy
    And he has ordered 2 GreenGoodsness smothy
