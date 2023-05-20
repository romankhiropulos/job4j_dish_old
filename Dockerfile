FROM maven:3.8.1-openjdk-17

RUN mkdir job4j_dish
WORKDIR job4j_dish

COPY . .

RUN mvn package -Dmaven.test.skip=true

CMD ["mvn", "liquibase:update", "-Pdocker"]

CMD ["java", "-jar", "target/dish_docker_task.jar"]