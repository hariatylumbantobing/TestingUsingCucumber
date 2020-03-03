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
Feature: Search Feature

  Scenario Outline: Search Test
    Given open firefox and start application
    When I click sign in button
    Then I enter username "d7644135@urhen.com" and password "qwerty123"
    And then I enter my search query <query>  
    Then I click search button and get search result
    
    Examples: 
      | query | 
      | "dress" 						|  
      | "gown"  						|  
			|	"122"	  						|
			|	"asjdkfldsjaklf"	  |			
			|	"shirt 12"	  			|