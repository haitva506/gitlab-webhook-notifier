# creates a layer from the openjdk:17-alpine Docker image.
FROM maven:3.6.3-openjdk-8

MAINTAINER haitva

# cd /app
WORKDIR /app

# Refer to Maven build -> finalName
ARG JAR_FILE=/out/artifacts/gitlab_webhook_notifier_jar/gitlab-webhook-notifier-0.0.1-SNAPSHOT.jar

# cp target/spring-gitlab-ci-0.0.1-SNAPSHOT.jar /app/spring-gitlab-ci.jar
COPY ${JAR_FILE} gitlab-webhook-notifier-0.0.1-SNAPSHOT.jar

# java -jar /app/spring-gitlab-ci.jar
CMD ["java", "-jar", "-Xmx1024M", "/app/gitlab-webhook-notifier-0.0.1-SNAPSHOT.jar"]

# Make port 8080 available to the world outside this container
EXPOSE 8200
