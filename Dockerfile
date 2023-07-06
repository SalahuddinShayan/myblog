FROM openjdk:17
EXPOSE 8081
ADD target/myblog-0.0.1-SNAPSHOT.war myblog-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/mybog-0.0.1-SNAPSHOT.war" ]