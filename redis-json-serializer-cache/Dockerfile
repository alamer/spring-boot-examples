FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.8_10
WORKDIR /app
COPY ./target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]