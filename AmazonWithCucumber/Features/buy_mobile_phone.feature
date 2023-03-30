Feature: Buy mobile phone on Amazon

@regression
Scenario: A user should be able to buy a mobile phone on Amazon successfully
Given a user is on the landing page of Amazon
When he clicks on the Mobiles link
And he hovers the pointer over Mobiles & Accessories
And he clicks on Apple in the sub-menu
And he clicks on the first available phone on the next page
And he switches focus on the new tab
And he clicks on Buy Now button
Then he must be able to buy the mobile phone successfully