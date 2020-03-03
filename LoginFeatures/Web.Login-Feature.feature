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
@Tag
Feature: Login Feature
	@Tag1
  Scenario Outline: Test Login with Username <username> Credentials <password>
    Given open firefox and start application
    When I click sign in button
    And I enter username <username> and password <password>
    Then I get message

	Examples:
	|username|password|
 		|"d7644135@urhen.com"|"qwerty123"|
 #		|"qwerty123"|"d7644135@urhen.com"|
 #		|"d7644135@urhen.com"|""|
 #		|""|"qwerty123"|
 #		|"abc@gmail.com"|"0"|
