Feature: I am Automating OrangeHRM APP

Background: Common Steps

Given User launch the chrome browser
Then User Enter the URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: Job - I am creating a Job Record

When user enter Login id as "Admin" and Login password as "admin123"
And user Click the admin
Then user Enter the Jobs 
When user enter the Job tittle as "Python098" and Job Description "Python_Desc098" and Job note "Python_Note098"
Then click on logout
Then user close the browser
