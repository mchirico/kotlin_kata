FROM openjdk:8
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN apt-get update
RUN apt-get install zip
RUN apt-get install curl
RUN /usr/src/myapp/installKotlin.sh


# RUN javac Main.java
# CMD ["java", "Main"]

# docker build -t us.gcr.io/mchirico/kotlin:test .