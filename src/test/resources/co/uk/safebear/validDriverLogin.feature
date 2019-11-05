Feature: Login as a valid driver

  User Story
  As a valid Driver
  the driver is able to login successfully

  Rules:
  *The user must be a valid Driver
  *The user must have a valid car order

  @high-impact
  Scenario Outline: As a valid driver the user is able to login
    When The driver enters username "<username>" and password "<password>"
    Then The driver is successfully logged in
    Examples:
      | username  | password    |
      | varun1980 | password123 |
      | driver123 | Password456 |
