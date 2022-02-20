

Feature: Infinite Scroll page

  Scenario:the user can scroll down and up
    Given the user is on the Menu page
    And the user clicks on "Infinite Scroll" link
    When the user scroll to the bottom of the pape twice
    Then the user shouldn't see the Infinite Scroll title
    And the user scrolls back to top of the page
    Then the user can see Infinite Scroll title

