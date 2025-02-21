FROM openjdk:17
EXPOSE 10000
ADD target/dockerbatch5-0.0.1-SNAPSHOT.jar employee.jar
ENTRYPOINT ["java","-jar","/employee.jar"]