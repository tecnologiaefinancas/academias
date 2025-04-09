# Use an official Maven image with Java 17 as the base image
FROM maven:3.9.2-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file to the container
# This allows Maven to download dependencies specified in the pom.xml
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the entire source code (src folder) to the container
COPY src ./src

# Build the application by cleaning and packaging it, skipping tests
RUN mvn clean package -DskipTests

# Use a lightweight image for the final container to run the application
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container for the final stage
WORKDIR /app

# Copy the JAR file generated in the build stage to the final container
COPY --from=build /app/target/academias-0.0.1-SNAPSHOT.jar .

# Expose the port the application will use
EXPOSE 8080

# Command to run the application inside the container
CMD ["java", "-jar", "/app/academias-0.0.1-SNAPSHOT.jar"]