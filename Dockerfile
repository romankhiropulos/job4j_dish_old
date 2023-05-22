FROM maven:3.8.1-openjdk-17

RUN mkdir job4j_dish

WORKDIR job4j_dish

COPY . .

RUN mvn package -Dmaven.test.skip=true

CMD ["java", "-jar", "target/dish-0.0.1-SNAPSHOT.jar"]