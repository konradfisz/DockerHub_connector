FROM java:8
RUN javac main.java
MAINTAINER kfisz
COPY mysql-connector-java-5.1.6-bin.jar /home/mysql-connector-java-5.1.6-bin.jar
CMD ["java","-jar","/home/mysql-connector-java-5.1.6-bin.jar","main"]
