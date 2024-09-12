# Use a base image with JDK 22
FROM openjdk:22-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the Maven build output JAR file to the container
COPY target/ticket-management-1.0-SNAPSHOT.jar /app/ticket-management.jar

# Expose port 8080 for the application
EXPOSE 8080

# Define the command to run your Spring Boot app
ENTRYPOINT ["java", "-jar", "ticket-management.jar"]
