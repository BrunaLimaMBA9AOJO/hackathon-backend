FROM openjdk:17
EXPOSE 8080
RUN mkdir /app
COPY build/libs/hackaton-0.0.1-SNAPSHOT.jar /app/hackathon-backend.jar

ENTRYPOINT ["java", "-jar","/app/hackathon-backend.jar"]