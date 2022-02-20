
Feature: Key Presses page

  Scenario Outline: the user can click the key
    Given the user is on the Menu page
    And the user clicks on "Key Presses" link
    When the user clicks on any "<key>"

    Then the user can see the "<expectedKey>" text on web page

    Examples:
      | key | expectedKey |
      | 3   | 3           |
      | h   | H           |
      | k   | K           |
      | /   | SLASH       |