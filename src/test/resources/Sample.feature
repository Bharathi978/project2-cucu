@Feature1
Feature: To check the Facebook page

  @key
  Scenario: To Check The Login page of the Application
    When user has to load the FaceBook Application
    
    # one Dimensional map
    When user has to pass the invalid username in email field
      | emailone   | sel@123  |
      | emailtwo   | phy@123  |
      | emailthree | java@123 |
      
    # Two Dimensional map
    And user has to pass the invalid password in password field
      | passsone | passtwo    | passthree |
      | phythan  | sql@12     | c#        |
      | apl@567  | phythan536 | java@76   |
      
    And user has to click the login button

  @scenario2
  Scenario Outline: to validate login with postive and negative combination datas
    When to lauch the url o the facebook application
    When to pass postive and neagative data in "<username datas>"email field
    And to pass postive and negative dat in"<password datas>" password field
    And to click login button

    Examples: 
      | username datas  | password datas |
      | seli@gmail.com  | sel@123        |
      | phyth@gmail.com | phy@123        |
      | java@gmail.com  | java@123       |
