
Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Title of your scenario
    Given User was in telecom homepage
    And user clicking on add customer
    When  user was filling all the details
    | Fname   | sharu       |
    | lname   | sp        |
    | mail    | singam@gmail.com | 
    | address | madurai      |
    | mobile  | 6396874621         |
       And  user clicking on submit button
   Then user should get the customer id

  