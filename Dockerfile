FROM openjdk:8

# Create Databot-eureka directory
#RUN mkdir -p /eureka-service
WORKDIR /eureka-service


# Bundle eureka source
COPY . .

# Install eureka dependencies
#./gradlew build && java -jar build/libs/iot-eureka-1.0.0.jar
#ADD target/iot-eureka-1.0.0.jar iot-eureka-1.0.0.jar
ENTRYPOINT ["java","-jar","/iot-eureka-1.0.0.jar"]

EXPOSE 8761

