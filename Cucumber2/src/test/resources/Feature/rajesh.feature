@Smoke
Feature: Validate the login functionality in Restockit

Given Launch the restockit URL
Scenario: to validate the login with username and password

When User have to validate username and password
And Choose the product and add to cart
Then check if the product is added in cart

