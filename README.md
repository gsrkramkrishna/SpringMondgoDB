# SpringMondgoDB

Please use the below commands to run the image.

please intstall mongodb. I have intalled in my linux machine.

please pull the latest mongo image.

docker build . -t spring-boot-mongo-db

docker run -d -p 27000:27017 --name mongo mongo

docker run -p 8080:8080 --name spring-boot-mongo-db --link=mongo  spring-boot-mongo-db
