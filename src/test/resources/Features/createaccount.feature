@CreateAccount
Feature: As a User I should be able to Create Account and Shop Material

@Create
Scenario: User able to create account
Given I am on Mystore home page
When I enter email address and click on create account
Then I should be able to create account with details
Then I should see the created account details
