FROM openjdk:21-jdk-slim
WORKDIR /app
COPY /target/spring_with_docker-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
LABEL authors="kyawyelwin"
ENTRYPOINT ["java", "-jar", "app.jar"]