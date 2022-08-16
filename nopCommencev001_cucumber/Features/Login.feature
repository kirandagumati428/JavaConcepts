Feature: Login

Scenario: sucuessfully login with valid credentials
Given User Lunch Chrome Broswer
When User Opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then Page Tittle Should be "Dashboard /nopCommerce administration"
When User Click on Logout link
Then page Tittle should be "Your store. Login"
And Close the broswer

