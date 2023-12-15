FROM ubuntu

RUN apt-get update && apt-get install -y openjdk-8-jdk

COPY ./ /app

WORKDIR /app

RUN javac Calculator.java

CMD ["java", "Calculator"]