# UserService

UserService gives the name of the user based on the id from database which is shared with LostAndFoundService.

## Consumed by :
This service is consumed by LostAndFoundService(https://github.com/hitendra1908/lostandfound-service.git). First run LostAndFoundService and then run UserService.

## Technologies Used
This project utilizes the following technologies:
* Spring Boot 3.3.2
* Spring Data JPA
* mysql:8.0
* Maven 3.3.2
* Java 21
* Docker

## How to Run the Project

1. Clone the repository:
   ```sh
   https://github.com/hitendra1908/user-service.git

2. Build the project from root folder:
   ```sh
   mvn clean install

3. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run

Application runs on localhost:8090
