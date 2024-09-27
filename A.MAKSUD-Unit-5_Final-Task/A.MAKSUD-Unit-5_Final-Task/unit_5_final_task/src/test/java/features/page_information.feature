Feature: Viewing Details
  As a user
  I want to search for an article and access its information
  To be able to view information about the article

  Scenario: Viewing Page Information
    Then Main page is displayed
    When I search for the term "Bengal tiger" and click search button
    And I click on the Tool menu button and Page information button on the Article page
    Then The information page for the "Bengal tiger" article is displayed
