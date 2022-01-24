FROM openjdk:11-jdk as builder
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} springboot-movie-api.jar
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/springboot-movie-api.jar"]
