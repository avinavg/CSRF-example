# CSRF-example


# How To Run :
	Clone this project and Run the main method in Application.java from IntelliJ and wait for service to start 
		- Service A will start on port 8080 by default 
		
	Clone service-B using this url " https://github.com/avinavg/serviceB.git" and follow the same procedure for it too
		- Service B is configured to start at port 8081 
		

Service A : contains the service that you log-in to i.e the service vulnerable to CSRF, it exposes the following endpoints

		- localhost:8080/ : Starting default endpoint for authentication; username is your VPN username and for password just enter password 
		- localhost:8080/sendMoney : an endpoint to send money
		- localhost:8080/logout : to logout of the application 
		
		** if youre too lazy to actually enter the cred everytime you logout, use these to mock login/logout behavior ** 
		- localhost:8080/letMeGo : a temporary enpoint in which can log you out for testing without actually logging you out of the spring app
		- localhost:8080/letMeIn : a temporary endpoint to log you in without entering your credentials again 		
		
Service B : A malicious service that has imp endpoints of serviceA that it can call once you log-on to Service-A
		
		- localhost:8081/sayHi : Test Endpoint
