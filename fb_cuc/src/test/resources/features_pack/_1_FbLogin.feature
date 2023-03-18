
Feature: Facebook login functionality Testing
  
  Scenario Outline: Checking login with valid credentials
  Given user launch Chrome browser
  And enters URL as "https://www.facebook.com/"
  Then user should get Welcome Page of Facebook
  When enters username as <username> and password as <password>
 # Then user should get Home Page of Facebook
  And user click on Login button
  And user click on user icon
  And user click on Logout button
  Then user should get Welcome Page of Facebook
  And browser should close
  
  Examples:

|username|password|
|er.nikhilpande@gmail.com|Facebook@nik|
|8975703189|pandenavnath7|   