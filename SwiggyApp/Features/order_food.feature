Feature: Order food online on Swiggy

@Swiggy
Scenario Outline: A user should be able to order food online on Swiggy successfully
Given a user is on the landing page of Swiggy
And he Enters location as "<city>"
And he selects first location from suggested location in suggestion-box
And he clicks on find food icon
And he clicks on the first available restaurants on the next page
And he switches focus on the new tab
And he clicks on add button over the first available food item
Then he clicks on checkout button
Examples:
|city|
|Bhopal|
|Indore|





