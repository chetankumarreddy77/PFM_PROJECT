Feature: Create NATIONALITY Record Automation in orange HRM

Background: Common Steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01  NATIONALITY Record
		And User enters username as "Admin" and password as "admin123"
    Then browse to NATIONALITY Page
    When Add NATIONALITY Records with NNAME as "INDIAN1234567"   
    When Click on logout button
    Then Close Browser
    
