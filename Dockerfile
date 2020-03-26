FROM java:openjdk-8-alpine

COPY target/atlasmicros.jar /opt/service/atlasmicros.jar
WORKDIR /opt/service

EXPOSE 8080

CMD ["java","-jar","/opt/service/atlasmicros.jar"]