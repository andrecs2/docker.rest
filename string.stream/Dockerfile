# Dockerfile

# MAINTAINER  Andre Carlos <andrecs2@gmail.com>

FROM openjdk:7-jdk

VOLUME /tmp

ARG MAVEN_VERSION=3.2.1
ARG USER_HOME_DIR="/root"
ARG SHA=40e1bf0775fd3ebcac1dbeb61153b871b86b894f
ARG BASE_URL=https://archive.apache.org/dist/maven/binaries/

RUN apt-get update && \
    apt-get install -y \
      curl \
  && rm -rf /var/lib/apt/lists/*

RUN apt-get install bash git openssh-client

RUN mkdir -p /usr/share/maven /usr/share/maven/ref \
  && curl -fsSL -o /tmp/apache-maven.tar.gz ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
  && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
  && rm -f /tmp/apache-maven.tar.gz \
  && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn

ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

CMD ["/bin/sh" "-c","git","config","--global","--unset","http.proxy"]

CMD ["mkdir", "/aplicacao"]

WORKDIR /
CMD ["git","clone","https://github.com/andrecs2/docker.rest.git","aplicacao"]

WORKDIR aplicacao/string.stream
#CMD ["mvn", "-version"]

#CMD ["cd", "docker.rest/string.stream/"]
CMD ["ls", "-lh"]
#WORKDIR docker.rest/stream.string/
CMD ["mvn", "clean","package","-e"]
#COPY ./target/string.stream-0.0.1-SNAPSHOT.jar /usr/src/stream/
#WORKDIR /usr/src/stream
#EXPOSE 8080
#CMD ["java", "-jar", "string.stream-0.0.1-SNAPSHOT.jar"]

