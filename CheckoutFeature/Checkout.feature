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
Feature: Checkout Feature

  Scenario: Test Checkout
    Given open firefox and start application
    When I click sign in button
    And I enter username "d7644135@urhen.com" and password "qwerty123" and login
    And I click home logo
    And I add product and directly go to checkout page
    And I proceed to checkout and agree to terms and agreement
    And I select to pay using bank wire
    Then I will confirm my order

