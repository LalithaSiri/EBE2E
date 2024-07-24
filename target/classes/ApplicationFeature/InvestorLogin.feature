Feature: Investor successful login

#Scenario: Investors Login page validation
#Given user is on Investor Login page
#When user gets the title of the page
#Then form lable should be "Sign in with your email address"

#Scenario: Forgot Password
#Given user is on Investor Login page
#Then Forgot password link should be displayed

Scenario: Login sucessful
Given user is on Investor Login page
And wait for page to load
When enter username "bhargavi.sponsor+qa26@gmail.com"
When enter password "Lsnworks@2022"
And click on Sign in button