@US_01_registiration
  Feature: US01_User should be registered from fashion field

    @US_01-TC_01_registeringAsFashion
    Scenario: US_01_TC_01_FashionRegistry
      Given User visits " https://commerceos.staging.devpayever.com/registration/fashion/"
      Then User fills the fields
      And Clicks signup button
      Then User fills out business information fields
      And Clicks submit button
      Then Use clicks on Get Started
      And Verifies following apps are present on dashboard:Transactions,Checkout,Connect,Products,Shop,Blog,Settings

    @US_01-TC_02_registeringAsSantander
    Scenario: US_01_TC_02_SantanderRegistry
      Given User visits " https://commerceos.staging.devpayever.com/registration/santander/"
      Then User fills the fields
      And Clicks signup button
      Then User fills out business information fields for Santander
      And Clicks submit button
      Then Use clicks on Get Started
      And Verifies following apps are present on dashboard:Checkout,Connect,Point Of Sale,Settings


