FROM openjdk:8-jdk-alpine
#https://wiki.alpinelinux.org/wiki/Setting_up_a_new_user
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]