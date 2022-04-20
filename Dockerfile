FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD Cars-Directory/build/libs/Cars-Directory-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]