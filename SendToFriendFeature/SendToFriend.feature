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
Feature: Send To Friend Feature

  @tag1
  Scenario: Test Send To Friend
    Given open firefox and start application
    When I click sign in button
    And I enter username "d7644135@urhen.com" and password "qwerty123"
    And I click logo
    And I click more on a dress
    And then I click send to a friend
    Then I fill the form and send the catalog to friend
