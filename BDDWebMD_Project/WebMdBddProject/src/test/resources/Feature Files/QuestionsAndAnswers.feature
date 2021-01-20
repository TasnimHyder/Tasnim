Feature: Questions and Answer

Scenario: User finds answers to question regarding an health issue.

Given I land on the WebMD homepage
When I move the mouse over to health a-z
And I click on Questions and answers
And I land on the browse by topic page 
And I click on eating disorders
And I land on the eating disorder questions and answers
And I click on the types of eating disorder question
Then I should be taken to the answer 


