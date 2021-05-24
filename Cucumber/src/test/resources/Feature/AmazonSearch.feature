  
Feature: Search page verification

  @searchText
  Scenario Outline: Verify search related output
    Given launch browser and navigate to application
    When I search with a <text>
    And I click on search button
    Then Verify the output is <text>
    
    Examples:
    | text |
    |"car"|
 