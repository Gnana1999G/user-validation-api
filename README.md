# User Validation API

A Spring Boot REST API project developed to learn request validation, DTOs, and global exception handling in backend applications.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Validation
- Maven
- Eclipse IDE
- Postman

---

## Features

- User Registration API
- Request Validation
- Email Validation
- Password Validation
- Age Validation
- Global Exception Handling
- Clean JSON Error Responses

---

## Project Structure

```text
src/main/java
 ├── controller
 │     └── UserController
 │
 ├── dto
 │     └── UserRequest
 │
 ├── exception
 │     └── GlobalExceptionHandler
 │
 └── UserValidationApiApplication
```

---

## API Endpoint

### Register User

POST

```bash
http://localhost:8080/users
```

---

## Valid Request Example

```json
{
  "name": "Ravi",
  "email": "ravi@gmail.com",
  "password": "spring123",
  "age": 25
}
```

Response:

```text
User Registered Successfully
```

---

## Invalid Request Example

```json
{
  "name": "",
  "email": "abc",
  "password": "12",
  "age": 10
}
```

Response:

```json
{
  "name": "Name is required",
  "email": "Invalid email format",
  "password": "Password must be at least 6 characters",
  "age": "Age must be at least 18"
}
```

---

## Validation Annotations Used

| Annotation | Purpose |
|------------|---------|
| `@NotBlank` | Prevent empty values |
| `@Email` | Validate email format |
| `@Size` | Validate string length |
| `@Min` | Validate minimum numeric value |
| `@Valid` | Trigger validation |

---

## How to Run the Project

### 1. Clone Repository

```bash
git clone git@github.com:Gnana1999G/user-validation-api.git
```

---

### 2. Open in Eclipse

Import as:

```text
Existing Maven Project
```

---

### 3. Run Application

```text
Run As → Spring Boot App
```

---

### 4. Test API

Use:
- Postman
- Thunder Client
- REST Client

---

## Concepts Learned

- REST API Development
- DTO (Data Transfer Object)
- Request Validation
- Global Exception Handling
- Clean API Responses
- Spring Boot Architecture
- JSON Request Handling

---

## Future Improvements

- Database Integration
- JWT Authentication
- Login API
- Swagger Documentation
- Password Encryption
- User Roles & Authorization
- Docker Deployment

---

## Sample Workflow

```text
Client Request
      ↓
Controller
      ↓
Validation
      ↓
Exception Handling
      ↓
JSON Response
```

---

## Author

Gattam Gnanendra

---

## GitHub Topics

```text
spring-boot
validation
rest-api
java
backend
dto
exception-handling
maven
```
