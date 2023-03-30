Feature: Err msg validation

Background: A user is on the landing Page
Given he clicks on the free online courses link
Then he clicks on the login link

@regression
Scenario: A user with invalid credentials will see an error msg
And he enters an invalid emailid
And he enters an invalid password
And  he clicks on the login button
Then he must see a message "The email or password you have entered is invalid."

@multiple_usernames
Scenario Outline: Login functionality with invlaid credentials will see same errror msg
And he enters an invalid emailid as <emailid>
And he enters an invalid password as <password>
And he clicks on login btn
Then he must see a message "The email or password you have entered is invalid."

Examples:
|emailid|password|
|rahulsinh@gmail.com|Rahul@5529|
|pankajsin@gmail.com|Pankaj@5529|



