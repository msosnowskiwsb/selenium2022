Feature: Test OrangeHRM Login Page

  Scenario Outline: Check login with wrong credentials
    Given Open login page
    When User enters <username> and <password>
    And Click on login button
    Then The validation <message> is displayed
    Examples:
      | username | password | message             |
      | Admin    | Admin    | Invalid credentials |
      | admin    | admin    | Invalid credentials |
      | fsufyds  | fsdąą    | Invalid credentials |
      | fdsfsdds | fdfsd    | Invalid credentials |