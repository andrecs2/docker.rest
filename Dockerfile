FROM openjdk:8-jdk
MAINTAINER andrecs2
COPY string.stream/target/string.stream-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/
ENTRYPOINT ["/usr/bin/java"]
# run app
COPY entrypoint.sh /
RUN chmod +x /entrypoint.sh

CMD ["sh", "entrypoint.sh"]

CMD ["-jar", "/opt/spring-cloud/lib/string.stream-0.0.1-SNAPSHOT.jar"]
VOLUME /var/lib/spring-cloud/config-repo
EXPOSE 8080
