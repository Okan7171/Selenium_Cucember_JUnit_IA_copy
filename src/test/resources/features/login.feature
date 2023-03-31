@login
Feature: Login Functionality


  Scenario: Login As Selim
    Given The user is on the login page
    When The user type in Selim's credentials
    Then The user should be able to login successfully

  Scenario:
    Given The user is on the login page
    When The user type in valid credentials: "sgezer@gmail.com" and "sg12345678"
    Then The user should be able to see userName: "Selim Gezer"


  Scenario:
    Given The user is on the login page
    When The user type in valid credentials: "Ramanzi@test.com" and "Test123456"
    Then The user should be able to see userName: "Mansimmo"



