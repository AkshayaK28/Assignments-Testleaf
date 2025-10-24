Feature: Login functionality of Leaftaps application

Scenario: Login with valid credentials
Given  Launch the browser
Given Load the URL
Given Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click on login button
Then It should navigate to next page
