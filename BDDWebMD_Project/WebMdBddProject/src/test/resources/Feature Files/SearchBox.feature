Feature: Search box

Scenario Outline: User should successfully use the searchbox

Given I land on the WebMD homepage
When I click on the searchbox
And I enter "<search>"
And I click the search button 
Then I should be taken to the search result page
And the browser should close

Examples:
|     search       |
|     thyroid      |
|     diaebetes    |
|     anxiety      |