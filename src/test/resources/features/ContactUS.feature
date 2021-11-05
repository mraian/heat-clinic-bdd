Feature: Contact US
  testing the contact us button on the footer of the homepage


  Scenario Outline: Posting comment with all the required filled

    Given I open a browser
    And I navigate to the contact us page
    When I enter name as "<name>"
    And I enter email as "<email>"
    And I enter my comments
    Then I should see the confirmation message

      Examples:
      |name|email|
      |Raian|raian@gmail.com|
      |Rafi |rafi@gmail.com |



  Scenario: Posting comment without all the required filled
    Given I open a browser
    And I navigate to the contact us page
    When I enter name as "raian"
    #And I enter email as "test@gmail.com"
    And I enter my comments
    Then I should the error message

