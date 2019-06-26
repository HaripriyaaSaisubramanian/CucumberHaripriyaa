#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Selenium easy web

  Background: 
    Given In selenium easy home page
    And Click input forms

  @tag1
  Scenario: Selenium easy task input forms(Simple form demo)
    When Insert all the details
    |Enter a and b value|20|40|
    Then Validate the outcomes
 @tag2
  Scenario: Selenium easy task input forms(Check box demo)
    
    When Select the required options
    Then Validate the required outcomes
    And check more outcomes
    @tag3 
    Scenario: Selenium easy task input forms(Radio Button Demo)
    
    When I complete action
    Then I validate the outcomes
    And check more outcomes
    
