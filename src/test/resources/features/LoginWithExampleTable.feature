Feature: Login
  practicing login with example table so that we can test the feature with multiple data
  @dataDrivenTest
  Scenario Outline: login with valid credentials
    Given I open a browser
    And I navigate to the login page
    When I enter username as "<username>"
    And I enter password as "<password>"
    Then I should see customer welcome page

    Examples:
    |username					|password |
    |graviton111@graviton.com   |graviton1|
    |graviton11@graviton.com    |graviton1|
    |graviton101@graviton.com   |graviton1|
