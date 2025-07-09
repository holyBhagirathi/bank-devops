# Use Jenkins with JDK 17
FROM jenkins/jenkins:lts-jdk17

USER root

# Install Maven
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    maven

# Install Docker CLI
RUN apt-get update && \
    apt-get install -y \
    ca-certificates \
    curl && \
    curl -fsSL https://get.docker.com -o install-docker.sh && \
    sh install-docker.sh && \
    usermod -a -G docker jenkins
EXPOSE 8080