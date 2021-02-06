# CSRF-example

Service A : contains the service that you log-in to i.e the service vulnerable to CSRF, it exposes the following endpoints

		- / : Starting default endpoint for authentication; username is your VPN username and for password just enter password 
		- /sendMoney : an endpoint to send money
		- /logout : to logout of the application 
		
		** if youre too lazy to actually enter the cred everytime you logout, use these to mock login/logout behavior ** 
		- /letMeGo : a temporary enpoint in which can log you out for testing without actually logging you out of the spring app
		- /letMeIn : a temporary endpoint to log you in without entering your credentials again 		
		
Service B : A malicious service that has imp endpoints of serviceA that it can call once you log-on to Service-A
		
		- /sayHi : Test Endpoint
