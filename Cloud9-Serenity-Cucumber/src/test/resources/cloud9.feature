Feature: Login

  Scenario: Cloud9 Airlines - Valid Login
    Given That I am on the Clould9 home page
    When Log in with valid user id  and password
    Then I will be take to the itenarary page

    Scenario: Cloud9 Airlines - Add a booking
      Given That I am on the Clould9 home page
      When Log in with valid user id  and password
      Given I navigate to the booking page
      When I add a valid booking
      Then My booking is successful
