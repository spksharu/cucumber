

Feature: Title of your feature
  I want to use this template for my feature file
 

  

 
  Scenario: Title of your scenario
  
         Given the User is in telecom homepage
    And the user click on add customer
  
    When the user is filling the details
    |sharu|sp|spksharu@gmail.com|madurai|9500193006|
    And the user click on submit button
    Then the user should get customer id
  
  
  Scenario: Title of your scenario1
     
    When the user is filling the details
        | Fname   | siva         |
    | lname   | priya        |
    | mail    | ab@gmail.com | 
    | address | nellore      |
    | mobile  | 1234         |
     And the user click on submit button
    Then the user should get customer id