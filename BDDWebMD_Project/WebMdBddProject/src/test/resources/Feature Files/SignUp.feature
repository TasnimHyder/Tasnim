Feature: WebMD Sign up Feature
	This feature is for WebMD sign up functionality
		
	@Sprint1 
	Scenario: Verify user is able to sign up using correct credentials
		Given I land on the WebMD homepage
		And I click on sign in
		And I click on sign up
		And I will be able to launch the WebMD Sign up page
		When I enter correct email "dragonwarriorstt@gmail.com"
		And I enter correct password "talentech123"
		And I enter correct date of birth "12.23.1992"
		And I click on sign up
		Then I should be able to sign up
