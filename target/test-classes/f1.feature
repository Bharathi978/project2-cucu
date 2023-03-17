Feature: To check the Facebook page

  @act
  Scenario: To Check The Login page of the Applications
    When user has to load the FaceBook Applications
    # one Dimensional map
    When user has to pass the invalid username in email fields
      | emailone   | sel@123  |
      | emailtwo   | phy@123  |
      | emailthree | java@123 |
    # one Dimensional map
    And user has to pass the invalid password in password fields
      | pass  | bharathi |
      | pass1 | sharathi |
    And user has to click the login buttons

  @scenarioTwo
  Scenario: To Check The Login page of the Applicatios
    When user has to load the FaceBook Applicatios
    # Two Dimensional map
    When user has to pass the invalid username in email fiels
      | emailone | emailtwo   | emailthree |
      | phythan  | sql@12     | c#         |
      | apl@567  | phythan536 | java@76    |
    # Two Dimensional map
    And user has to pass the invalid password in password fiels
      | passsone | passtwo   | passthree |
      | phyt     | sql@1245  | c#  56    |
      | apl@67   | phythn536 | java@76w  |
    And user has to click the login butto

  @Data
  Scenario: To Check The Login page of the Applicationsd
    When user has to load the FaceBook Applicationsd
    When user has to pass the invalid username in email fieldsd
    And user has to pass the invalid password in password fieldsd
    And user has to click the login buttonsd
