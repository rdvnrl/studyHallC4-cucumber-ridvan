Feature: Insurance user registration

  Scenario: Verify that user is able to go to insurance project
    When The user wants to go to guru99_Insurance Project
    Then The user wants to verify that user is on the insurance page

  Scenario: Verify that user is able to register for insurance project
    Given The user wants to go to guru99_Insurance Project
    When The user wants to choose title as "Mrs"
    And The user wants to enter first name as "firstName"
    And The user wants to enter surname name as "surname"
    And The user wants to enter phone number as "phoneNumber"
    And The user wants to enter date of birth as "dateOfBirth"
    And The user wants to choose the license type as "licenseType"
    And The user wants to choose the license period as "licensePeriod"
    And The user wants to choose the occupation period as "occupation"
    And The user wants to enter the street address as "street address"
    And The user wants to enter the city period as "city"
    And The user wants to enter the country period as "country"
    And The user wants to enter the postal code period as "postalCode"
    And The user wants to enter the emailAddress period as "emailAddress"
    And The user wants to enter the password period as "password"
    And The user wants to enter the confirmPassword period as "confirmPassword"
    And The user wants to click create button
   # Then The user wants to verify that account has been created





