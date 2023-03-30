Features: Fill SighUp form on Medicare Website

@regression
Scenario: A user is able to fill sign up form and successfully able to register
Given A user is on the landing Page
And  he clicks on the SignUp link
And he enters first name in the first name text box
And he enters last name in the last name text box
And he enters email in the email text box
And he enters contact number in the contact number text box
And he enters password in the password text box
And he reenters password in the  confirm password text box
And he clicks on the next billing button
And he enters address in the address line one text box
And he enters address in the address line two text box
And he enters city in the city text box
And he enters postal code in the postal code text box
And he enters state in the state text box
And he enters country in the country text box
And he clicks on the next-confirm button 
And he clicks on the confirm button
Then he he must be able to register successfully