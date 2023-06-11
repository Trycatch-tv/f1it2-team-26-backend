#
# Build stage
#
FROM maven:3.6.0-jdk-13-alpine AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM adoptopenjdk/openjdk13
COPY --from=build /team26/src/target/team26-0.0.1-SNAPSHOT.jar team26.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","team26.jar"]