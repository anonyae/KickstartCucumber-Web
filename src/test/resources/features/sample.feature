Feature: Sample feature

  Scenario: Sample scenario
    Given I am at school
    When I do study
    And I also do something else
    Then I confirm that I learned

  Scenario: Sample scenario
    Given I am at work
    When I do work
    And I also do something else
    Then I confirm that I got paid


  Scenario Outline: Sample scenario
    Given I am <somewhere>
    When I do <something>
    And I also do something else
    Then I confirm that I <expected>

    Examples:
      |somewhere|something | expected |
      |at school| work     | got paid |
      |at work  | study    | learned  |