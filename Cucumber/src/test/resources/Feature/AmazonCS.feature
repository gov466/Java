
@CustomerServiceRun
Feature: customerServicePage verifications
  
@smokeTest
 @VerifyCustomerServiceScreen
  Scenario: verify the header text inside customerservice page
    Given launch browser and navigate to application
    When I click on customer service link
    Then verify the text inside the screen
    
    @Regression
    @smokeTest
    @printServiceTabs
     Scenario: Print all Services avaialble
    Given launch browser and navigate to application
    When I click on customer service link
    Then print all the servicetabs available
    
  
  