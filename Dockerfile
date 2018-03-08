FROM openjdk:8-jdk
MAINTAINER baeldung.com
COPY string.stream/target/string.stream-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/
#COPY files/spring-cloud-config-server-entrypoint.sh /opt/spring-cloud/bin/
#ENV SPRING_APPLICATION_JSON= \ 
#  '{"spring": {"cloud": {"config": {"server": \
#  {"git": {"uri": "/var/lib/spring-cloud/config-repo", \
#  "clone-on-start": true}}}}}}'
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/string.stream-0.0.1-SNAPSHOT.jar"]
VOLUME /var/lib/spring-cloud/config-repo
EXPOSE 8080
