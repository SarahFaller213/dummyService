FROM openjdk:8-jdk-alpine
VOLUME /tmp

COPY ["entrypoint.sh", "service/target/dummy-service-app-0.0.1-SNAPSHOT.jar", "/app/"]

RUN chmod 755 /app/entrypoint.sh

ENTRYPOINT ["/app/entrypoint.sh"]
EXPOSE 8080
