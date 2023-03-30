Feature: Buy simplilearn courses

@regression
Scenario: A user should be able to buy simplilearn courses successfully
Given A user is on the landingPage
When he clicks on the free online courses link
And he clicks on the log in button
And he enters emailid in the emailid textbox
And he enter password in the password textbox
And he clicks on the login button
Then he successfully buy a course


