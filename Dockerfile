FROM java:8
RUN javac main.java
MAINTAINER kfisz
COPY testprj-1.0-SNAPSHOT.jar /home/testprj-1.0-SNAPSHOT.jar
CMD ["java", "main"]
