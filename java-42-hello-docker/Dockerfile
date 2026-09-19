# Java 21 uygulamasını çalıştırmak için JRE yeterlidir.
FROM eclipse-temurin:21-jre

WORKDIR /app

ARG JAR_FILE

COPY ${JAR_FILE} application.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "application.jar"]
