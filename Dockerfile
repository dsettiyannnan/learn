FROM amazoncorretto:17.0.8
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/learn.jar
ENTRYPOINT ["java","-jar","/app/learn.jar"]
