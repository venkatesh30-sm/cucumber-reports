@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Sanity
  Scenario: To validate the Facebook
    Given user launches facebook
    When user enter login details
    Then user hits login btn
    
    @Smoke
  Scenario: To validate the flipkart
    Given user launches flipkart
    When user searches for iphone
    Then user hits search button
    
    
   
    