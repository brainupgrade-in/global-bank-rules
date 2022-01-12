FROM openjdk:8-jre-alpine
MAINTAINER info@brainupgrade.in
COPY target/*.jar app.jar
ENTRYPOINT ["/usr/bin/java", "-Djava.security.egd=file:/dev/./urandom", "-jar","app.jar"]

# docker build -t brainupgrade/global-bank-rules:1.0.0 -t localhost:32000/brainupgrade/global-bank-rules:1.0.0 . && docker push localhost:32000/brainupgrade/global-bank-rules:1.0.0 && docker push brainupgrade/global-bank-rules:1.0.0