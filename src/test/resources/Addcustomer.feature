
@tag
Feature: To test add customer functionality
  I want to use this template for my feature file

  @tag1
  Scenario: To test the customer id
   Given the user is in add customer page
   When the user fill in valid customer details
   When the user click the submit button 
   Then the user should see the customer id is generated
     
 