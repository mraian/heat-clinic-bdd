Feature: Gift card purchase
  @tagTest
  Scenario: Purchase gift card as a guest user and collect on delivery
    Given I open a browser
    And I go to the Gift Cards page
    When I click on the gift card
    And I enter personal message
    And I enter SenderName and RecipientEmail and RecipientName
      |Raian     |joy@gmail.com |Joy          |
    And I pick on one color
    And I click on the add to cart button
    And I checkout as guest
    Then I should see the purchase confirmation




