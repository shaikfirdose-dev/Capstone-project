#Feature: Verify elements on the-internet.herokuapp.com

Scenario: Verify A/B Testing and Dropdown
Given I am on the homepage of "http://the-internet.herokuapp.com/"
    When I click on the "A/B Testing" link
    Then I should see the text "A/B Test Variation 1" on the page
    When I go back to the homepage
    And I click on the "Dropdown" link
    And I select "Option 1" from the dropdown
    Then "Option 1" should be selected
    When I go back to the homepage
    And I click on the "Frames" link
    Then I should see the following hyperlinks:
      - "Nested Frames"
      - "iFrame"
