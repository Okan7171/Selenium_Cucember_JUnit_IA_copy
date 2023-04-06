Feature: Profile Page Tests

  Background:
    Given The user is on the login page
    When The user type in valid credentials: "sgezer@gmail.com" and "sg12345678"
    Then The user should be able to see userName: "Selim Gezer"

  Scenario: The user navigates to Add Education Page

    #Given The user is on the login page
    #When The user type in valid credentials: "sgezer@gmail.com" and "sg12345678"
   # Then The user should be able to see userName: "Selim Gezer"
    When The user navigate to "Selim Gezer" and "My Profile"
    Then The user should be able to see overview page
    When The user navigate to profile tab: "Add Education"
    Then The user should be able to see "Add Education" button

  @wip
  Scenario: The user navigates to Add Education Page and fill the education form

    #Given The user is on the login page
   # When The user type in valid credentials: "sgezer@gmail.com" and "sg12345678"
    #Then The user should be able to see userName: "Selim Gezer"
    When The user navigate to "Selim Gezer" and "My Profile"
    Then The user should be able to see overview page
    When The user navigate to profile tab: "Add Education"
    Then The user should be able to see "Add Education" button
    When The user fill the form with followings : "İTÜ","Bachelor","Engineering","08052020","11122022","Hard program"
    Then The user should see added record with: "İTÜ"
    And The user should be able to delete last added record with : "İTÜ"

  @wip
  Scenario: The user navigates to Add Education Page and fill the education form with List

    #Given The user is on the login page
    #When The user type in valid credentials: "sgezer@gmail.com" and "sg12345678"
    #Then The user should be able to see userName: "Selim Gezer"
    When The user navigate to "Selim Gezer" and "My Profile"
    Then The user should be able to see overview page
    When The user navigate to profile tab: "Add Education"
    Then The user should be able to see "Add Education" button
    When The user fill the form with following list
    |Ankara University|
    |Bachelor|
    |Engineering|
    |08052020|
    |11122022|
    |Hard program|
    Then The user should see added record with: "Ankara University"
    And The user should be able to delete last added record with : "Ankara University"