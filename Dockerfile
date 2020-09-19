FROM openjdk:8
ADD target/springmongodb-1.0.0.jar springmongodb.jar
#ENTRYPOINT ["java", "-jar", "springmongodb.jar"]
EXPOSE 8080
RUN bash -c 'touch /springmongodb.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo/test", "-Djava.security.egd=file:/dev/./urandom","-jar","/springmongodb.jar"]
