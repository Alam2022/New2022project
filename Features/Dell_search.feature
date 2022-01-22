Feature: Dell Search box validation


Scenario Outline:


Given User visit Dell homepage
When when user click search box and Put "<Product name>" 
Then User will be able to see iphones

Examples: 
|Product name|
|iphone|

