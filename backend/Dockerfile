FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:21

EXPOSE 8080

ADD ./target/ksawards-0.0.1-SNAPSHOT.jar ksawards.jar

ENTRYPOINT ["java","-jar","/ksawards.jar"]