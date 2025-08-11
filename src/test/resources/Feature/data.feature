Feature: User Management System

  Scenario: Add new employee details
    Given I open the demoqa web tables page
    When I click the Add button and fill employee details:
      | firstName | lastName | email               | age | salary | department |
      | John      | Doe      | john.doe@mail.com   |  30 |  50000 | IT         |
      | Jane      | Smith    | jane.smith@mail.com |  28 |  45000 | HR         |
    Then I should see correct result
      | firstName | lastName | email               | age | salary | department |
      | John      | Doe      | john.doe@mail.com   |  30 |  50000 | IT         |
      | Jane      | Smith    | jane.smith@mail.com |  28 |  45000 | HR         |
