Feature: Delete Lead function of Leaftaps application

Scenario Outline: Delete Lead with multiple data

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on the Crmsfa link
And Click on the Leads link
When Click on find leads
And Click on Phone tab
Given Enter Phone Number
When Click on find lead
And Click on lead from list
And Click on the Delete button