Feature: Facebook feature

  Scenario Outline: Login facebook
    Given The user is in facebook login page
    When The user will enter the details"<email>","<password>"
    Then The user will be in facebook homepage

    Examples: 
      | email                   | password   |
      | sharipriyaa17@gmail.com | haripriyaa |
      | hari@gmail.com          | hari       |
