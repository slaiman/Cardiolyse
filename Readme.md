# Project requirements 

	- JDK 14
	- maven installed 
	- Docker installed 


## For development  build

	- mvn clean install

## For  building docker image 

	- mvn clean install -Pdocker -DskipTests
	
## To test if image is there

	 - docker image list
	 
## To run the container from the image and expose its port to local machine port

	 - docker run -d -p 8080:8080 cardiolysetest

## To test if the container is running 

	- docker ps

## To check the container logs 
	
	- docker exec -it Container_ID /bin/bash
