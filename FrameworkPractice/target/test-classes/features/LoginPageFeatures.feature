#Author: your.email@your.domain.com

@Regression
Feature: Login Page
  @tag1
  Scenario:To verify that error message should be display for invalid password.

    Given I am on the landing page
    And I click Login
    And I enter username as vijayamand@gmail.com
    And I enter password as ascd234
    And I click on login button   