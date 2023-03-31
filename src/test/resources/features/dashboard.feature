Feature: Dashborad Tab Names

  Scenario:
    Given The user is on the login page
    When The user type in valid credentials: "sgezer@gmail.com" and "sg12345678"
    Then The user should be able to see userName: "Selim Gezer"
    And The user should be able to see all tabs that shown on the dashborad page
      | Dashboard   |
      | Developers  |
      | Components  |
      | Forms       |
      | JavaScript  |
      | Selim Gezer |