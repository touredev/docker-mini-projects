FROM eclipse-temurin:17-alpine

LABEL maintainer="touremjean@hotmail.com"
# Running applications with user privileges helps to mitigate some risks
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

WORKDIR /tasks-manager

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=./target/*.jar

COPY ${JAR_FILE} /tasks-manager/app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","app.jar"]