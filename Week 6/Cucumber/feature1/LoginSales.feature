Feature: Login to Salesforce Application
Scenario: Login with valid credentials

Given Launch the Chrome browser
Given Load the Salesforce URL
Given Enter Username as 'axyakrishnaraj758@agentforce.com'
Given Enter Password as 'Akshayak@28'
When Click on Loginin button
When Click on toggle menu button from the left corner
And Click view All 
And Click Sales from App Launcher
And Click on Accounts tab
And Click on New button
Given Enter 'Akshaya' as account name
When Select Ownership as Public
When Click save 
Then Verify Account name