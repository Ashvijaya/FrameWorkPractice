@Regression 
Feature: Verify landing Page Features

   Scenario: Verify that main features is the site are displayed to the user
    Given I am on the landing page
    Then I see the features called Login
    Then I see the features called Create
    Then I see the features called Upload
    Then I see the features called Artists