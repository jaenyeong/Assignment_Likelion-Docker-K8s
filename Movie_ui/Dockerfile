FROM openjdk:11-jdk as builder
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} springboot-movie-ui.jar
VOLUME /tmp
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/springboot-movie-ui.jar"]
