Feature: Scenario Problem


	Scenario: First works
		
		Given the list for module XX:
			|question	|
			| Age 		|
			| Height	|
		When foo
		Then I should see the following list:
			|Answer		|
			|22			|
			|70			|
		

	Scenario: Second fails
		
		Given the list for module XX:
			|question	|
			| Age 		|
			| Height	|
		When foo
		Then I should see the following list:
			|Answer		|
			|22			|
			|70			|