FROM openjdk:8
ADD target/java-jenkins-docker-project.jar java-jenkins-docker-project.jar
ENTRYPOINT ["java", "-jar","java-jenkins-docker-project.jar"]
EXPOSE 8080