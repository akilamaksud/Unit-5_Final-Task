Feature: Download
  As a user
  I want to download an article as a PDF
  To be able to have a portable version of the content

  Scenario: Downloading the Article
    Then Main page is displayed
    When I search for the term "Albert Einstein" and click search button
    And I Click on Tool menu button and Download as PDF button on the Article page
    Then The file is downloaded by clicking on the Download button 
