Feature: Login

  #data driven testing


  Scenario: login with valid credential
    Given I open a browser
    And I navigate to the login page
    When I enter username as "graviton111@graviton.com"
    And I enter password as "graviton1"
    Then I should see customer welcome page



  #scenario outline with examples keyword
  Scenario Outline: login with valid credentials
    Given I open a browser
    And I navigate to the login page
    When I enter username as "<email>"
    And I enter password as "<password>"
    Then I should see customer welcome page
    Examples:
    | email|password|
    |graviton11@graviton.com| graviton1|
    |graviton111@graviton.com| graviton1|

#data table

  Scenario: login with valid credential using data table
    Given I open a browser
    And I navigate to the login page
    When I enter username and password
    |graviton111@graviton.com|graviton1|

    Then I should see customer welcome page