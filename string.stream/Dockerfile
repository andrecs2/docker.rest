# Dockerfile

# MAINTAINER  Andre Carlos <andrecs2@gmail.com>

FROM openjdk:8-jre-alpine
VOLUME /tmp
COPY ./target/string.stream-0.0.1-SNAPSHOT.jar /usr/src/hola/
WORKDIR /usr/src/hola
EXPOSE 8080
CMD ["java", "-jar", "string.stream-0.0.1-SNAPSHOT.jar"]
