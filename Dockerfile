FROM java:8
MAINTAINER kfisz
COPY main.java /home/main.java
COPY mysql-connector-java-5.1.6-bin.jar /home/mysql-connector-java-5.1.6-bin.jar
RUN javac /home/main.java
CMD ["java","-jar","/home/mysql-connector-java-5.1.6-bin.jar","/home/main"]
