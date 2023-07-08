FROM openjdk:17
EXPOSE 8081
ADD target/myblog-0.0.1-SNAPSHOT.war myblog-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/myblog-0.0.1-SNAPSHOT.war" ]