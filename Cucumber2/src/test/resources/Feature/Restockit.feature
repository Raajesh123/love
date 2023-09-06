Feature: to validate the username and password
Scenario: check with valid username and password
Scenario Outline:
 to validate the login with valid and invalid credential
Given User have to launch restockit restockit.featureurl
When  User have to Valid "<username>" and "<password>"
And   User have to check the correct and incorrect page
Then  Close the url
Examples:
|username|password|
|rajesh.eie94@gmail.com|rajesh@|
|amazon.com|amazon@12334|
|flipkart.com|flipkart@12345|