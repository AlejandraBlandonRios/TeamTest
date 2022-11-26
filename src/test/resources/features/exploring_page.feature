Feature: User explore the Team International page in Chrome browser.

  Scenario Outline: User explore the page
    Given User go through the page
    When User scroll all page, section by section
    And Fill out <FirstName>, <LastName>, <Company>, <Email>, <Phone>, <Message>.
    Then User send the information to Contact Sales
    Examples:
      |FirstName|LastName|Company|Email         |Phone|Message|
      |Alejandra|Blandon |Team   |t@hotmail.com |55555|Test   |