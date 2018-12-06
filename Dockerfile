FROM java:7
MAINTAINER kfisz
COPY . /var/www/java
WORKDIR /var/www/java
RUN javac Sample.java
CMD ["java","-jar","mysql-connector-java-5.1.6-bin.jar","Sample"]
