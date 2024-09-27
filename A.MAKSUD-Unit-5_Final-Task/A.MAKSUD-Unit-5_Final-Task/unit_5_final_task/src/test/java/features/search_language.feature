Feature: Search Language
  As a user
  I want to search for an article in spanish language
  To be able to view  the article

  Scenario: Viewing Article in Spanish
    Then Main page is displayed
    When I input "Gabriel García Márquez" text, change search language to Spanish and click submit button
    Then The article page for "Gabriel García Márquez" is open
