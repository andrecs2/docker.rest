
FROM openjdk:7-jdk


RUN apt-get update && \
    apt-get install -y \
      curl \
  && rm -rf /var/lib/apt/lists/*


WORKDIR /opt/app/

RUN curl file_host/string.stream-0.0.1-SNAPSHOT.jar -o app.jar

RUN java -jar app.jar
