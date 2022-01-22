 Feature: User want to login facebook

Scenario Outline:

Given User visits facebook homepage
When User inputs user "<ID>" and "<password>" and click on login button
Then User will be able to login to facebook

Examples:

|ID| |password|					

|alam.anft@gmail.com| |123456|

