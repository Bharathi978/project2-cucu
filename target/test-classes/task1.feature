Feature: To validate the login page for tools
  @Muthu
  Scenario: To Check The Login page of the Application in tools
    Given user has launch the browser
    When user has launch the url Qatool
    When user has to the pass the first name
    When user has to the pass the last  name
    When user has to the pass the email name
    When user has to the pass the mobile number
    And user has to the pass the country name
    And user has to the pass the city name
    And user has to the pass the message
    

    @Tools
    Scenario Outline: To check the Login in Tools page

    Given user has launch the browsers
    When  user has to the pass the first names"<First Data>"
    When  user has to the pass the last names"<Last Data>"
    When user has to the pass the email names"<Email>"
    When user has to the pass the mobile numbers"<Mobile>"
    And user has to the pass the country names
    And user has to the pass the city names"<City>"
    And user has to the pass the messages"<Message>"
    
    Examples:
    
        | First Data | Last Data |       Email      |   Mobile |    City   |     Message     |
        |  BHARATHI  | SHARATHI  |sharathi@gmail.com|9789654327|Tirunelveli|checked condision|
        |  SHARATHI  |  KUMAR    | KUMAR@GMAIL.COM  |9876543456| MADURAI   |     VERIFY      |