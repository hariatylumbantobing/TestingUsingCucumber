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
Feature: Sign-Up Feature

  @tag1
	Scenario Outline: Test Sign Up 
		Given open firefox and start application
		When I click sign in button
		And I fill email <email> to register new account
		And I click the create an account button
		And I click the gender
		And I fill <first name> and <last name>
		And Password <password>
		And Choose all the dropdown
		And I fill the <first name> and <last name>
		And I fill <company>, <address>, <city> and select <state> 
		And I fill <postal code> 
		And I register <home phone> and/or <mobile phone>
		Then I get message
		
		
 Examples:
 |email|first name|last name|password|company|address|city|state|postal code|home phone|mobile phone|
 |"zxcc@gmail.com"|"zx"|"cc"|"123"|""|""|""|""|""|""|""|""|
 |"zxcc@gmail.com"|"zx"|"cc"|"123"|"new company"|" The Bronx, NY 10454, Amerika Serikat New York, New Hampshire 10454 "|""||""|""|""|""|
 |"zxcc@gmail.com"|"zx"|"cc"|"123"|"new company"|" The Bronx, NY 10454, Amerika Serikat New York, New Hampshire 10454 "|""||"Alabama"|""|""|""|
 |"zxcc@gmail.com"|"zx"|"cc"|"123"|"new company"|" The Bronx, NY 10454, Amerika Serikat New York, New Hampshire 10454 "|"Moody"||"Alabama"|"35005"|""|""|
 |"zxcc@gmail.com"|"zx"|"cc"|"123456"|"new company"|" The Bronx, NY 10454, Amerika Serikat New York, New Hampshire 10454 "|"Moody"||"Alabama"|"35005"|""|"08232827892"|
  
