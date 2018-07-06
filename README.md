As per: https://github.com/spring-guides/gs-rest-service

# Simple rest service to scrape links from websites.

## Build Instructions

### Maven
#### Linux
If you are using Maven, you can run the application using `./mvnw spring-boot:run`.  Or you can build the JAR file with `./mvnw clean package`. Then you can run the JAR file:
`java -jar target/gs-rest-service-0.1.0.jar`

#### Windows
If you are using Maven, you can run the application using `mvnw.cmd spring-boot:run`.  Or you can build the JAR file with `mvnw.cmd clean package`. Then you can run the JAR file:
`java -jar target/gs-rest-service-0.1.0.jar`

### Gradle
#### Linux
If you are using Gradle, you can run the application using `./gradlew bootRun`. Or you can build the JAR file using `./gradlew build`. Then you can run the JAR file:
`java -jar build/libs/gs-rest-service-0.1.0.jar`

#### Windows
If you are using Gradle, you can run the application using `gradlew.bat bootRun`. Or you can build the JAR file using `gradlew.bat build`. Then you can run the JAR file:
`java -jar build/libs/gs-rest-service-0.1.0.jar`

:java_version: 1.8

## Test the service

Now that the service is up, visit http://localhost:8080/links?url=https://bbc.co.uk