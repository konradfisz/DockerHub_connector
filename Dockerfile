FROM java:7
RUN javac Sample.java
MAINTAINER kfisz
COPY Sample.java /home/Sample.java
COPY mysql-connector-java-5.1.6-bin.jar /home/mysql-connector-java-5.1.6-bin.jar
RUN javac /home/Sample.java
CMD ["java","-jar","/home/mysql-connector-java-5.1.6-bin.jar","/home/Sample"]
