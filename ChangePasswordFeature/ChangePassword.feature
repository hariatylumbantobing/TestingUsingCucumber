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
Feature: Change Password Feature
 
  Scenario Outline: Title of your scenario outline
    Given open firefox and start application
    When I click sign in button
    Then I enter username "d7644135@urhen.com" and password "qwerty123"
  	And I click my personal information
  	And I fill my current password <current password>
  	And I fill my new password <new password> and confimation <confirmation> and click save
		Then I get the confirmation if the password is changed

    Examples: 
      | current password  | new password | confirmation|
      |  "" 							|     "" 			 |    "" 			 |
      |  "qwerty123" 			| "12345"  		 |    ""    	 |
      |  "qwerty123" 			| "123" 			 | 		"123"    |
      |	 "qwerty123"			|	"12345"			 |		"12345"	 |
      |	 "qwerty123"			| "12345"			 |		"12345"	 |
      |	 "12345"					| "qwerty123"	 |"qwerty123"	 |
      