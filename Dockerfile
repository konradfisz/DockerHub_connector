FROM java:8
MAINTAINER kfisz
COPY . /var/www/java
WORKDIR /var/www/java
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8
RUN javac Sample.java
CMD ["java","-classpath","mysql-connector-java-8.0.12.jar:.","Sample"]
