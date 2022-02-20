


@wip
Feature:Login page

  Background:
    Given the user is on the Menu page
    And the user clicks on "Form Authentication" link

  Scenario:the user can login with valid credentials
    When the user enters valid credentials
    Then the user should be able to login
    When the user logs out
    Then the user should be able to see Login Page

  Scenario Outline:User can not login with any invalid username and valid password
    When user enters invalid "<username>" and valid "<password>"
    Then user should see error "Your username is invalid!" message
    Examples:
      | username  | password             |
      | tomsmithh | SuperSecretPassword! |
#      | tomsmit   | SuperSecretPassword! |
#      | tomsmith1 | SuperSecretPassword! |
#      | tomsmith! | SuperSecretPassword! |
#      | tom smith | SuperSecretPassword! |
#      | 5tomsmith | SuperSecretPassword! |
#      | *tomsmith | SuperSecretPassword! |
#      | toms?mith | SuperSecretPassword! |
#      |           | SuperSecretPassword! |

    Scenario Outline: User can not login with valid username and invalid password
      When user enters valid "<username>" and invalid "<password>"
      Then user should see error "Your password is invalid!" message
      Examples:
        | username | password              |
        | tomsmith | supersecretpassword!  |
#        | tomsmith | SUPERSECRETPASSWORD!  |
#        | tomsmith | SuperSecretPasswordI  |
#        | tomsmith | Super SecretPassword! |
#        | tomsmith | SuperSecretPassword1  |
#        | tomsmith | +SuperSecretPassword! |
#        | tomsmith | 2SuperSecretPassword! |
#        | tomsmith | SuperSecret&Password! |
#        | tomsmith |                       |





