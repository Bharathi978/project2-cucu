@Feature2
Feature: To validate the login functionality of amazon application

@sanity 
  Scenario: To  validate with valid username and valid password od amazon login
   
    When To lanuch the url of the amazon application
    
    
    # one Dimensional list
    When To pass valid username and emil filed
    
      | java@gmail.com | pythan@gmail.com | selenium@gmail.com |
      
    When To click and continue button
    
    
    # Two Dimensional List
    When To pass the valid password in password filed
    
    
      | java@34 | 345678 | ph@gmail   |
      | sel@45  | ch@457 | javascript |
      | apl     | maven  | java       |
      
      
    And To click the sign button