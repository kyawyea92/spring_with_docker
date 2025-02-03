# Spring Boot with Docker and Docker Compose

This project demonstrates how to containerize a Spring Boot application using Docker and manage it with Docker Compose.

## Prerequisites

- Java 21 or later
- Maven
- Docker
- Docker Compose

## Getting Started

### 1. Clone the Repository
```sh
git clone https://github.com/kyawyea92/spring_with_docker.git
cd spring_with_docker
```

### 2. Build the Project
```sh
mvn clean package
```
This will generate a JAR file in the `target/` directory.

### 3. Build and Run with Docker

#### **Build Docker Image**
```sh
docker build -t spring-demo .
```

#### **Run Container**
```sh
docker run -p 8080:8080 spring-demo
```

### 4. Using Docker Compose
Instead of manually building and running the container, you can use Docker Compose:
```sh
docker-compose up --build
```
This command will:
- Build the Docker image
- Start the container and expose it on port `8080`

To stop the container, run:
```sh
docker-compose down
```

### 5. Access the Application
Open a browser or use `curl`:
```sh
curl http://localhost:8080/api/v1/api/docker
```
Expected response:
```
Hello, this is a Spring Boot application running inside a Docker container!
```

## Project Structure
```
.
├── src
│   ├── main
│   │   ├── java/com/docker/exercise
│   │   │   ├── SpringWithDockerApplication.java
│   │   │   ├── controller
│   │   │     ├── DockerAPI.java
├── Dockerfile
├── docker-compose.yml
├── pom.xml
└── README.md
```

## License
This project is open-source and available under the MIT License.

