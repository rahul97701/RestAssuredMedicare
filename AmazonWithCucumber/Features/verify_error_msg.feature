Feature: Error Message Validation

Background:
Given user is on the landing page
When he hovers the pointer over Hello Sign in menu
And he clicks on the sign in button in the sub menu

@regression
Scenario: A user with invalid credentials should see an error message while logging i
And he enters an invalid username in the username textbox
And he clicks on continue button
Then he must see the error message "We cannot find an account with that email address"

@multiple_usernames
Scenario Outline: Login functionality should always given same error message when tried with multiple invalid validations
And he enters an invalid username as "<username>"
And he clicks on continue button
Then he must see the error message "We cannot find an account with that email address"
Examples:
|username|
|rahulsingh@gmail.com|
|pankajsingh@gmail.com|
|rksingh@gmail.com|