Feature: Login functionality of Leaftaps application

#Background:
#Given Launch the Browser
#And Load the url
@sanity
Scenario: Login with valid credentials

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page

@smoke
Scenario: Login with invalid credentials

And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on the Login button
But It throws the error message