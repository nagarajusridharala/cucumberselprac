Feature: Search functionality feature

@smokeTest
Scenario: Product Search
Given User is on Product Log Page
When User enter product name Cucumber in Searh box
Then Product "Cucumber" is seachble

@seleniumTests
Scenario: Product Search
Given User is on Product Log Page
When User enter product name Cucumber in Searh box
Then Product "Cucumber" is seachble

@seleniumTests
Scenario Outline: Perform product search and move to cart page
Given User is on Product Log Page
When User enter product name <Name> in Searh box
And Add Items to cart
And Procced to Checkout page
Then Verify product <Name> displayed in cart
Examples:
|Name	|
|Brocolli|
|Beetroot|

